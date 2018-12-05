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
        System.out.println("��ӭʢ����Ϸ������");
        game.play();
        System.out.println("��ӭ�ٴι���ʢ����Ϸ������");
    }

}
