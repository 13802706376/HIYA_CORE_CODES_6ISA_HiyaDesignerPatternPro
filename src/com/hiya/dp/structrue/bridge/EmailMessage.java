package com.hiya.dp.structrue.bridge;

public class EmailMessage implements IMessage
{
    @Override
    public void send(String message, String toUser)
    {
        System.out.println(String.format("ʹ���ʼ��ķ�����������Ϣ %s �� %s", message, toUser));
    }
}
