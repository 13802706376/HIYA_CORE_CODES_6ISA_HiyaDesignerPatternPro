package com.hiya.dp.behavior.strategy;

/**
 * 在策略模式（Strategy Pattern）中，一个类的行为或其算法可以在运行时更改。这种类型的设计模式属于行为型模式。在策略模式中，我们创建表示各种策略的对象和一个行为随着策略对象改变而改变的 context 对象。策略对象改变 context 对象的执行算法。
    意图：定义一系列的算法,把它们一个个封装起来, 并且使它们可相互替换。
    主要解决：在有多种算法相似的情况下，使用 if...else 所带来的复杂和难以维护。
    策略模式是对算法的包装，是把使用算法的责任和算法本身分割开来，委派给不同的对象管理。策略模式通常把一个系列的算法包装到一系列的策略类里面，作为一个抽象策略类的子类。用一句话来说，就是：“准备一组算法，并将每一个算法封装起来，使得它们可以互换”。
　　●　环境(Context)角色：持有一个Strategy的引用。
　　●　抽象策略(Strategy)角色：这是一个抽象角色，通常由一个接口或抽象类实现。此角色给出所有的具体策略类所需的接口。
　　●　具体策略(ConcreteStrategy)角色：包装了相关的算法或行为
 *
 */
public class StrategyClient
{
    public static void main(String[] args)
    {
        Context calculator = new Context();
        //设置计算策略
        calculator.setStrategy(new BusStrategy());
        //计算价格
        System.out.println("公交车乘10公里的价格：" + calculator.calculatePrice(10));
    }
}
