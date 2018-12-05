package com.hiya.dp.structrue.decorator;

/**
 * 相似的模式，拦截方法增加前后的逻辑
    装饰模式就是给一个对象增加一些新的功能，而且是动态。
    装饰器模式（Decorator Pattern）允许向一个现有的对象添加新的功能，同时又不改变其结构。这种类型的设计模式属于结构型模式，它是作为现有的类的一个包装。
    这种模式创建了一个装饰类，用来包装原有的类，并在保持类方法签名完整性的前提下，提供了额外的功能。
    使用场景： 1、扩展一个类的功能。 2、动态增加功能，动态撤销。
    注意事项：可代替继承。
 * @author zjq
 *
 */
public class DecoratorClient
{

    public static void main(String[] args)
    {
        IGame game = new FightGame();
        
        GameShengdaDecorator gameShengdaDecorator = new GameShengdaDecorator(game);
        gameShengdaDecorator.play();
        
        GameTencentDecorator gameTencentDecorator = new GameTencentDecorator(gameShengdaDecorator);
        gameTencentDecorator.play();
    }

}
