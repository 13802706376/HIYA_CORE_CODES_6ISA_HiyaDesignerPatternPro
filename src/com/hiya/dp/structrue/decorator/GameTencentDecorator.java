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
        System.out.println("��ӭ��Ѷ��Ϸ������");
        game.play();
        System.out.println("��ӭ�ٴι�����Ѷ��Ϸ������");
    }

}
