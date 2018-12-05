package com.hiya.dp.structrue.bridge;

/**
 * �Žӣ�Bridge�������ڰѳ�����ʵ�ֻ����ʹ�ö��߿��Զ����仯���������͵����ģʽ���ڽṹ��ģʽ����ͨ���ṩ���󻯺�ʵ�ֻ�֮����Žӽṹ����ʵ�ֶ��ߵĽ������ά�ȱ仯��
ʹ�ó����� 
    1�����һ��ϵͳ��Ҫ�ڹ����ĳ��󻯽�ɫ�;��廯��ɫ֮�����Ӹ��������ԣ��������������֮�佨����̬�ļ̳���ϵ��ͨ���Ž�ģʽ����ʹ�����ڳ���㽨��һ��������ϵ�� 
    2��������Щ��ϣ��ʹ�ü̳л���Ϊ���μ̳е���ϵͳ��ĸ����������ӵ�ϵͳ���Ž�ģʽ��Ϊ���á� 
    3��һ����������������仯��ά�ȣ���������ά�ȶ���Ҫ������չ��
    ע������������������仯��ά�ȣ�ʹ���Ž�ģʽ���ʺϲ����ˡ�
    ��һ��ά��ƽ�ȹ�ϵ�ýӿڣ��ʼ�/����/ϵͳ��Ϣ��������һ��ά�ȵݽ������������ó����ࣨ��ͨ/����/�ؼ���
 * @author zjq
 *
 */
public class BridgeClient
{

    public static void main(String[] args)
    {
        //����ά�ȣ����г�������нӿڵĶ��� ����̬ 
        IMessage smsMessage = new SmsMessage(); 
        AbstractMessage abstractMessage = new CommonMessage(smsMessage); 
        abstractMessage.sendMessage("������ͨ����", "����"); 
        
        smsMessage = new SmsMessage(); 
        abstractMessage = new UrgencyMessage(smsMessage); 
        abstractMessage.sendMessage("���żӼ�����", "����"); 
        
        smsMessage = new SmsMessage(); 
        SpecialUrgencyMessage specialUrgencyMessage = new SpecialUrgencyMessage(smsMessage); 
        specialUrgencyMessage.sendMessage("�����ؼ�����", "����"); 
        specialUrgencyMessage.watch("455");
        
        IMessage emailMessage = new EmailMessage(); 
        specialUrgencyMessage = new SpecialUrgencyMessage(emailMessage); 
        specialUrgencyMessage.sendMessage("�ʼ��ؼ�����", "����"); 
        specialUrgencyMessage.watch("455");
    }
}
