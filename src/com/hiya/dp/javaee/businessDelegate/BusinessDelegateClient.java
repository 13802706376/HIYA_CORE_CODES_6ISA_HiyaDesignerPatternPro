package com.hiya.dp.javaee.businessDelegate;

/**
 * ҵ�����ģʽ��Business Delegate Pattern�����ڶԱ�ʾ���ҵ�����������������������ͨ�Ż�Ա�ʾ������е�ҵ�������Զ�̲�ѯ���ܡ���ҵ���������������ʵ�塣
    �ͻ��ˣ�Client�� - ��ʾ���������� JSP��servlet �� UI java ���롣
    ҵ�����Business Delegate�� - һ��Ϊ�ͻ���ʵ���ṩ������࣬���ṩ�˶�ҵ����񷽷��ķ��ʡ�
    ��ѯ����LookUp Service�� - ���ҷ���������ȡ��ص�ҵ��ʵ�֣����ṩҵ������ҵ��������ķ��ʡ�
    ҵ�����Business Service�� - ҵ�����ӿڡ�ʵ���˸�ҵ������ʵ���࣬�ṩ��ʵ�ʵ�ҵ��ʵ���߼���
 *
 */
public class BusinessDelegateClient
{
    public static void main(String[] args)
    {
        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");
        businessDelegate.doTask();
        
        businessDelegate.setServiceType("JMS");
        businessDelegate.doTask();
    }
}
