package com.hiya.dp.structrue.bridge;

public class SysNoticeMessage implements IMessage
{
    @Override
    public void send(String message, String toUser)
    {
        System.out.println(String.format("ʹ��ϵͳ����Ϣ�ķ�����������Ϣ %s �� %s", message, toUser));
    }
}
