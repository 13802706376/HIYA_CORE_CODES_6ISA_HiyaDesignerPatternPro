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
        message = "�Ӽ���" + message;
        super.sendMessage(message, toUser);
    }
    
    /**
     * ��չ���Լ��Ĺ��ܣ����ĳ����Ϣ�Ĵ���״̬
     * @param messageId
     * @return
     */
    public Object watch(String messageId) 
    { 
        //���ݸ�������Ϣ�����ѯ��Ϣ�Ĵ���״̬����֯�ɼ�صĴ���״̬��Ȼ�󷵻ء� return null; 
        return null;
    }
}