package com.hiya.dp.structrue.bridge;

public class SmsMessage implements IMessage
{
    @Override
    public void send(String message, String toUser)
    {
        System.out.println(String.format("ʹ�ö��ŵķ�����������Ϣ %s �� %s", message, toUser));
    }
}
