package com.hiya.dp.structrue.decorator;

public class GameShengdaDecorator  implements IGame
{

    private IGame game;    
    public GameShengdaDecorator(IGame game)
    {    
        super();    
        this.game=game;    
    }    
    
    @Override
    public void play()
    {
        System.out.println("欢迎盛大游戏。。。");
        game.play();
        System.out.println("欢迎再次光临盛大游戏。。。");
    }

}
