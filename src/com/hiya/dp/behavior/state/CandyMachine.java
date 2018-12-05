package com.hiya.dp.behavior.state;

/**
 * ״̬ģʽ�Ͳ���ģʽ�Ա�
 * 
 * ��������������������֮����������֮���� ����µ�״̬����Զ������ף����Ҳ���Ҫ�޸�ʹ�����ǵ�Context����
 * ���Ƕ�����Ĵ������OCPԭ���������չӦ���ǿ����ģ����޸�Ӧ���ǹرյģ�����״̬ģʽ�Ͳ���ģʽ�У�Context������޸��ǹرյģ�����µ�״̬����ԣ�������Ҫ�޸�Context��
 * ����״̬ģʽ�е�Context���г�ʼ״̬һ��������ģʽͬ����Ĭ�ϲ��ԡ� ״̬ģʽ�Բ�ͬ��״̬��װ��ͬ����Ϊ��������ģʽ�Բ�ͬ�Ĳ��Է�װ��ͬ����Ϊ��
 * ���Ƕ���������ȥʵ�������Ϊ
 * 
 * ����ģʽ�Ĳ���������ǵġ���ͼ����ͬ��
 * 
 * ״̬ģʽ�����������״̬�����ǽ�һȺ��Ϊ��װ��״̬������,context����Ϊ��ʱ��ί�е���Щ״̬�е�һ��.����ʱ������ţ���ǰ״̬��״̬���󼯺������߸ı䣬�Է�ӳcontext�ڲ�״̬��
 * ��ˣ�context����ΪҲ����Ÿı䡣��Ҫ����µ�״̬ʱ������Ҫ�޸�ԭ����������µ�״̬�༴�ɡ�
 * ������ģʽ����Clientѡ��ͬ����Ϊ��ͨ����װһ������㷨��ΪClient�ṩ����ʱ����
 * ���ԡ�Client����������ʱ��ѡ����һ�㷨�������ı�ʹ���㷨��Context��һЩ���еĲ���ģʽ��������д��Щʹ���㷨�Ĵ��룬��������㷨��ѹ���㷨�������㷨���ͻ�ͨ������ָ��context
 * ��Ҫ��ϵĲ��Զ�������һ����
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
