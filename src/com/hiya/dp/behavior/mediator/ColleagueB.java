package com.hiya.dp.behavior.mediator;

public class ColleagueB extends AbstractColleague
{

    // ����ͬ����̳���Colleague,�˿̾Ϳ������н���mediator����ͨ����
    public ColleagueB(String name, AbstractMediator mediator)
    {
        super(name, mediator);
    }

    public void getMessage(String message)
    {
        System.out.println("ͬ��B" + name + "�����Ϣ" + message);
    }

    // ͬ��A���н���ͨ��
    public void contact(String message)
    {
        mediator.contact(message, this);
    }
}
