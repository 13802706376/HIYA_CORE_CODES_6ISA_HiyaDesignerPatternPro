package com.hiya.dp.structrue.decorator;

public class GameWangyiDecorator  implements IGame
{

    private IGame game;    
    public GameWangyiDecorator(IGame game)
    {    
        super();    
        this.game=game;    
    }    
    
    @Override
    public void play()
    {
        System.out.println("欢迎网易游戏。。。");
        game.play();
        System.out.println("欢迎再次光临网易游戏。。。");
    }

}
