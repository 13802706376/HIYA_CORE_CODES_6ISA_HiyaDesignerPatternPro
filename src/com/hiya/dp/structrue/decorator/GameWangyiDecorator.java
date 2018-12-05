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
        System.out.println("��ӭ������Ϸ������");
        game.play();
        System.out.println("��ӭ�ٴι���������Ϸ������");
    }

}
