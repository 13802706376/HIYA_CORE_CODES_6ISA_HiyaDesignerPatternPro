package com.hiya.dp.structrue.bridge;

public class EmailMessage implements IMessage
{
    @Override
    public void send(String message, String toUser)
    {
        System.out.println(String.format("使用邮件的方法，发送消息 %s 给 %s", message, toUser));
    }
}
