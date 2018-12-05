package com.hiya.dp.behavior.state.old;

/**
 * 如果我们采用传统的方法来写代码，那么在投入硬币这个行为操作的时候，我们会进行状态的判断，只有在处于待机状态情况下这种行为是正常的，而其他则非正常，
 * 那么其他行为也一样，都需要去先判断下当前的状态来进行操作。
 * 
1.存在大量的switch case 语句 当然可以用if else 也是一样的。
2.可扩展性差，并且一旦要加入一种新的状态，那么就会要修改所有的switch case 不符合开闭原则
3.没有采用面向对象的方式去封装
比如，这个时候，新增加了一种状态，赢家状态，即可以获取到两粒糖果；那么如果用上面的方式，肯定是不符合开闭原则的，同时扩展性也是不好的；


为了解决上面的问题，我们首先分析项目中变化的部分和不变的部分，抽化出变化的部分，我们发现糖果机提供的行为一般是不变的，就是投入硬币、转动曲柄给、退回硬币、机器发放糖果；
而糖果机的状态是可以变化的，可以新增出一种状态来，比如我们说的赢家状态。那么我们这个抽出变化的部分，即我们说的状态，于是出现了下面的结构设计方案：

这个结构图告诉我们，提炼出状态接口出来，然后将各个状态抽出，并去实现接口，每个状态都持有投入硬币，退回硬币，转动曲柄、售出糖果这几种行为对应的方法做出相应；而糖果机持有所有的状态，
并通过引用状态接口来操作各个状态；这种设计架构就是我们说的状态模式。

状态模式定义：对象行为的变化是由于状态的变化引入，那么即当内部状态发生变化的时候，就会改变对象的行为，而这种改变视乎就改变了整个类。



 * @author zjq
 *
 */
public class OldProcesstor
{

    final static int SoldOutState = 0; // 初始状态
    final static int OnReadyState = 1; // 待机状态
    final static int HasCoin = 2; // 准备状态
    final static int SoldState = 3; // 售出状态

    private int state = SoldOutState; // 变量,用于存放当前的状态值
    private int count = 0; // 糖果的数目

    public OldProcesstor(int count)
    {
        this.count = count;
        if (count > 0)
        {
            state = OnReadyState;
        }
    }

    // 投入硬币行为的时候，通过判断当前的状态来匹配所有的状态.
    public void insertCoin()
    {
        switch (state)
        {
        case SoldOutState:
            System.out.println("you can't insert coin,the machine sold out!");
            break;
        case OnReadyState: // 只有在待机状态的时候,投入硬币行为正确,并将状态改变为准备状态
            state = HasCoin;
            System.out.println("you have inserted a coin,next,please turn crank!");
            break;
        case HasCoin:
            System.out.println("you can't insert another coin!");

            break;
        case SoldState:
            System.out.println("please wait!we are giving you a candy!");

            break;
        }

    }

    // 回退硬币
    public void returnCoin()
    {
        switch (state)
        {
        case SoldOutState:
            System.out.println("you can't return,you haven't inserted a coin yet!");
            break;
        case OnReadyState:
            System.out.println("you haven't inserted a coin yet!");
            break;
        case HasCoin:
            System.out.println("coin return!");
            state = OnReadyState;
            break;
        case SoldState:
            System.out.println("sorry,you already have turned the crank!");
            break;
        }
    }

    // 转动曲柄
    public void turnCrank()
    {
        switch (state)
        {
        case SoldOutState:
            System.out.println("you turned,but there are no candies!");
            break;
        case OnReadyState:
            System.out.println("you turned,but you haven't inserted a coin!");
            break;
        case HasCoin:
            System.out.println("crank turn...!");
            state = SoldState;
            dispense();
            break;
        case SoldState:
            System.out.println("we are giving you a candy,turning another get nothing,!");
            break;
        }

    }

    // 触发发放糖果行为
    private void dispense()
    {
        count = count - 1;
        System.out.println("a candy rolling out!");
        if (count > 0)
        {
            state = OnReadyState;
        } else
        {
            System.out.println("Oo,out of candies");
            state = SoldOutState;
        }

    }

    public void printstate()
    {

        switch (state)
        {
        case SoldOutState:
            System.out.println("***SoldOutState***");
            break;
        case OnReadyState:
            System.out.println("***OnReadyState***");
            break;
        case HasCoin:

            System.out.println("***HasCoin***");

            break;
        case SoldState:
            System.out.println("***SoldState***");
            break;
        }

    }
}