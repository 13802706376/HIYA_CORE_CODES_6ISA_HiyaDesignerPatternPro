package com.hiya.dp.structrue.bridge;

public class AbstractMessage
{
    /**
     * ����һ��ʵ�ֲ��ֵĶ���
     */
    IMessage message;
    
    /** *
     *  ���췽��������ʵ�ֲ��ֵĶ��� * 
     *  @param implementor ʵ�ֲ��ֵĶ��� 
     *  */
    public AbstractMessage(IMessage message) 
    { 
        this.message = message;
    }

    /** 
     * * ������Ϣ��ί�ɸ�ʵ�ֲ��ֵķ��� *
     *  @param message Ҫ���͵���Ϣ * 
     *  @param toUser ������
     *   */ 
    public void sendMessage(String message, String toUser) 
    { 
        this.message.send(message, toUser); 
    }
}
