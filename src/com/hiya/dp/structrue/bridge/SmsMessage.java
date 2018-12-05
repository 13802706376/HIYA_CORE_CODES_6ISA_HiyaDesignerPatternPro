package com.hiya.dp.structrue.bridge;

public class SmsMessage implements IMessage
{
    @Override
    public void send(String message, String toUser)
    {
        System.out.println(String.format("使用短信的方法，发送消息 %s 给 %s", message, toUser));
    }
}
