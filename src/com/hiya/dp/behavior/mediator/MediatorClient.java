package com.hiya.dp.behavior.mediator;

/**
 * 中介者模式（Mediator Pattern）是用来降低多个对象和类之间的通信复杂性。这种模式提供了一个中介类，该类通常处理不同类之间的通信，并支持松耦合，使代码易于维护。中介者模式属于行
 * 为型模式。
        主要解决：对象与对象之间存在大量的关联关系，这样势必会导致系统的结构变得很复杂，同时若一个对象发生改变，我们也需要跟踪与之相关联的对象，同时做出相应的处理。
        应用实例： 1、中国加入 WTO 之前是各个国家相互贸易，结构复杂，现在是各个国家通过 WTO 来互相贸易。 2、机场调度系统。 3、MVC 框架，其中C（控制器）就是 M（模型）和 V（视图）的
        中
        介者。
        优点： 1、降低了类的复杂度，将一对多转化成了一对一。 2、各个类之间的解耦。 3、符合迪米特原则。
        
        中介者就是一个处于众多对象中间，并恰当地处理众多对象之间相互之间的联系的角色。以上代码中只有两个参与者类，但是这些我们都可以根据中介者模式的宗旨进行适当地扩展，即增加参与者类，
        然后中介者就得担负更加重的任务了，我们看到上面具体中介者类Mediator中的方法比较多而且有点乱。 所以，在解耦参与者类之间的联系的同时，中介者自身也不免任务过重，因为几乎所有的业
        务逻辑都交代到中介者身上了，可谓是“万众期待”的一个角色了。这就是中介者模式的不足之处了。此外，上面这个代码例子的参与者的属性和方法都是一样的，我们可以抽取一个抽象类出来，减少
        代码，但是有时候我们根本抽取不了多个“参与者”之间的共性来形成一个抽象类，这也大大增加了中介者模式的使用难度。 
 * @author zjq
 *
 */
public class MediatorClient
{
    public static void main(String[] args)
    {
        // 定义中介者
        MediatorImpl mediator = new MediatorImpl();
        // 定义具体同事类
        ColleagueA colleagueA = new ColleagueA("张三", mediator);
        ColleagueB colleagueB = new ColleagueB("李四", mediator);
        // 中介者知晓每一个具体的Colleague类
        mediator.setCollA(colleagueA);
        mediator.setCollB(colleagueB);
        colleagueA.contact("我是A，我要和同事B说说工作的事情");
        colleagueB.contact("我是B,我下午有时间,下午商量吧");
    }
}
