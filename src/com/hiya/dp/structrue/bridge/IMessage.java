package com.hiya.dp.structrue.bridge;

public interface IMessage
{
    /**
     * 发送消息
     * @param message 发送消息的内容
     * @param toUser 接收人
     */
    void send (String message, String toUser);
}
