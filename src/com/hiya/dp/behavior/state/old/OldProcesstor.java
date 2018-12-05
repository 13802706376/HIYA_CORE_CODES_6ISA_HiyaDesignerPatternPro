package com.hiya.dp.behavior.state.old;

/**
 * ������ǲ��ô�ͳ�ķ�����д���룬��ô��Ͷ��Ӳ�������Ϊ������ʱ�����ǻ����״̬���жϣ�ֻ���ڴ��ڴ���״̬�����������Ϊ�������ģ����������������
 * ��ô������ΪҲһ��������Ҫȥ���ж��µ�ǰ��״̬�����в�����
 * 
1.���ڴ�����switch case ��� ��Ȼ������if else Ҳ��һ���ġ�
2.����չ�Բ����һ��Ҫ����һ���µ�״̬����ô�ͻ�Ҫ�޸����е�switch case �����Ͽ���ԭ��
3.û�в����������ķ�ʽȥ��װ
���磬���ʱ����������һ��״̬��Ӯ��״̬�������Ի�ȡ�������ǹ�����ô���������ķ�ʽ���϶��ǲ����Ͽ���ԭ��ģ�ͬʱ��չ��Ҳ�ǲ��õģ�


Ϊ�˽����������⣬�������ȷ�����Ŀ�б仯�Ĳ��ֺͲ���Ĳ��֣��黯���仯�Ĳ��֣����Ƿ����ǹ����ṩ����Ϊһ���ǲ���ģ�����Ͷ��Ӳ�ҡ�ת�����������˻�Ӳ�ҡ����������ǹ���
���ǹ�����״̬�ǿ��Ա仯�ģ�����������һ��״̬������������˵��Ӯ��״̬����ô�����������仯�Ĳ��֣�������˵��״̬�����ǳ���������Ľṹ��Ʒ�����

����ṹͼ�������ǣ�������״̬�ӿڳ�����Ȼ�󽫸���״̬�������ȥʵ�ֽӿڣ�ÿ��״̬������Ͷ��Ӳ�ң��˻�Ӳ�ң�ת���������۳��ǹ��⼸����Ϊ��Ӧ�ķ���������Ӧ�����ǹ����������е�״̬��
��ͨ������״̬�ӿ�����������״̬��������Ƽܹ���������˵��״̬ģʽ��

״̬ģʽ���壺������Ϊ�ı仯������״̬�ı仯���룬��ô�����ڲ�״̬�����仯��ʱ�򣬾ͻ�ı�������Ϊ�������ָı��Ӻ��͸ı��������ࡣ



 * @author zjq
 *
 */
public class OldProcesstor
{

    final static int SoldOutState = 0; // ��ʼ״̬
    final static int OnReadyState = 1; // ����״̬
    final static int HasCoin = 2; // ׼��״̬
    final static int SoldState = 3; // �۳�״̬

    private int state = SoldOutState; // ����,���ڴ�ŵ�ǰ��״ֵ̬
    private int count = 0; // �ǹ�����Ŀ

    public OldProcesstor(int count)
    {
        this.count = count;
        if (count > 0)
        {
            state = OnReadyState;
        }
    }

    // Ͷ��Ӳ����Ϊ��ʱ��ͨ���жϵ�ǰ��״̬��ƥ�����е�״̬.
    public void insertCoin()
    {
        switch (state)
        {
        case SoldOutState:
            System.out.println("you can't insert coin,the machine sold out!");
            break;
        case OnReadyState: // ֻ���ڴ���״̬��ʱ��,Ͷ��Ӳ����Ϊ��ȷ,����״̬�ı�Ϊ׼��״̬
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

    // ����Ӳ��
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

    // ת������
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

    // ���������ǹ���Ϊ
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