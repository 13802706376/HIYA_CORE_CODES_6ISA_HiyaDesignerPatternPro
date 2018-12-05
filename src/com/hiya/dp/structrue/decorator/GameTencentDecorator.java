package com.hiya.dp.structrue.decorator;

public class GameTencentDecorator  implements IGame
{

    private IGame game;    
    public GameTencentDecorator(IGame game)
    {    
        super();    
        this.game=game;    
    }    
    
    @Override
    public void play()
    {
        System.out.println("欢迎腾讯游戏。。。");
        game.play();
        System.out.println("欢迎再次光临腾讯游戏。。。");
    }

}
