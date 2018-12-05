package com.hiya.dp.creator.abstractFactory;

/**
 * 创建型模式，一个接口，几个实现类，多个接口工厂类，工厂类各自产生自己的实例，增加子类不需要修改工厂类，只需要扩展子类实现类和子类工厂类即可。做到了开闭原则。
工厂方法模式有一个问题就是，类的创建依赖工厂类，也就是说，如果想要拓展程序，必须对工厂类进行修改，这违背了闭包原则，所以，从设计角度考虑，有一定的问题，如何解决？
就用到抽象工厂模式，创建多个工厂类，这样一旦需要增加新的功能，直接增加新的工厂类就可以了，不需要修改之前的代码。
 * @author zjq
 *
 */
public class GameClient
{
    public static void main(String[] args)
    {
        //增加子类不需要修改工厂类，只需要扩展子类实现类和子类工厂类即可，做到了开闭原则
        FightGameFactory fightGameFactory = new FightGameFactory();
        GunGameFactory gunGameFactory = new GunGameFactory();
        MotorGameFactory motorGameFactory = new MotorGameFactory();

        // 获取 FightGame 的对象，并调用它的 play 方法
        IGame fightGame = fightGameFactory.getGame();
        fightGame.play();

        // 获取 GunGame 的对象，并调用它的 play 方法
        IGame gunGame = gunGameFactory.getGame();
        gunGame.play();

        // 获取 MotorGame 的对象，并调用它的 play 方法
        IGame motorGame = motorGameFactory.getGame();
        motorGame.play();
    }
}
