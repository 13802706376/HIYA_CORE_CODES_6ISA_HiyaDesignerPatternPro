package com.hiya.dp.structrue.bridge;

public class SpecialUrgencyMessage extends AbstractMessage
{
    public SpecialUrgencyMessage(IMessage message)
    {
        super(message);
    }
    
    @Override
    public void sendMessage(String message, String toUser) 
    {
        message = "�ؼ���" + message;
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
    
    /**
     * ��չ���Լ��Ĺ��ܣ����ĳ����Ϣ�Ĵ���״̬2
     * @param messageId
     * @return
     */
    public Object watch2(String messageId) 
    { 
        return null;
    }
}