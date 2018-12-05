package com.hiya.dp.structrue.bridge;

public class UrgencyMessage extends AbstractMessage
{
    public UrgencyMessage(IMessage message)
    {
        super(message);
    }
    
    @Override
    public void sendMessage(String message, String toUser) 
    {
        message = "加急：" + message;
        super.sendMessage(message, toUser);
    }
    
    /**
     * 扩展它自己的功能，监控某个消息的处理状态
     * @param messageId
     * @return
     */
    public Object watch(String messageId) 
    { 
        //根据给出的消息编码查询消息的处理状态，组织成监控的处理状态，然后返回。 return null; 
        return null;
    }
}