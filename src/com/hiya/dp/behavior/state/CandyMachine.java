package com.hiya.dp.behavior.state;

/**
 * 状态模式和策略模式对比
 * 
 * 首先让我们来看看它们之间更多的相似之处： 添加新的状态或策略都很容易，而且不需要修改使用它们的Context对象。
 * 它们都让你的代码符合OCP原则（软件对扩展应该是开发的，对修改应该是关闭的）。在状态模式和策略模式中，Context对象对修改是关闭的，添加新的状态或策略，都不需要修改Context。
 * 正如状态模式中的Context会有初始状态一样，策略模式同样有默认策略。 状态模式以不同的状态封装不同的行为，而策略模式以不同的策略封装不同的行为。
 * 它们都依赖子类去实现相关行为
 * 
 * 两个模式的差别在于它们的”意图“不同：
 * 
 * 状态模式帮助对象管理状态，我们将一群行为封装早状态对象中,context的行为随时可委托到那些状态中的一个.随着时间的流逝，当前状态在状态对象集合中游走改变，以反映context内部状态，
 * 因此，context的行为也会跟着改变。当要添加新的状态时，不需要修改原来代码添加新的状态类即可。
 * 而策略模式允许Client选择不同的行为。通过封装一组相关算法，为Client提供运行时的灵
 * 活性。Client可以在运行时，选择任一算法，而不改变使用算法的Context。一些流行的策略模式的例子是写那些使用算法的代码，例如加密算法、压缩算法、排序算法。客户通常主动指定context
 * 所要组合的策略对象是哪一个。
 * 
 * @author zjq
 *
 */
public class CandyMachine
{
    State stateInitImpl;
    State stateOnReadyImpl;
    State stateReadyImpl;
    State stateSoldOutImpl;
    State stateWinnerImpl;
    private State state;
    private int count = 0;

    public CandyMachine(int count)
    {
        this.count = count;
        stateInitImpl = new StateInitImpl(this);
        stateOnReadyImpl = new StateOnReadyImpl(this);
        stateReadyImpl = new StateReadyImpl(this);
        stateSoldOutImpl = new StateSoldOutImpl(this);
        stateWinnerImpl = new StateWinnerImpl(this);
        if (count > 0)
        {
            state = stateOnReadyImpl;
        } else
        {
            state = stateInitImpl;
        }
    }

    public void setState(State state)
    {
        this.state = state;
    }

    public void insertCoin()
    {
        state.insertCoin();
    }

    public void returnCoin()
    {
        state.returnCoin();
    }

    public void turnCrank()
    {
        state.turnCrank();
        state.dispense();
    }

    void releaseCandy()
    {
        if (count > 0)
        {
            count = count - 1;
            System.out.println("a candy rolling out!");
        }

    }

    public int getCount()
    {
        return count;
    }

    public void printstate()
    {
        state.printstate();
    }
}
