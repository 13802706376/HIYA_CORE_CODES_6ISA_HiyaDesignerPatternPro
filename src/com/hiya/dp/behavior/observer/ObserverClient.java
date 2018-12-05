package com.hiya.dp.behavior.observer;

/**
 * ����������һ�Զ��ϵʱ����ʹ�ù۲���ģʽ��Observer Pattern�������磬��һ�������޸�ʱ������Զ�֪ͨ�����������󡣹۲���ģʽ������Ϊ��ģʽ��
��ͼ�����������һ��һ�Զ��������ϵ����һ�������״̬�����ı�ʱ���������������Ķ��󶼵õ�֪ͨ�����Զ����¡�
��Ҫ�����һ������״̬�ı����������֪ͨ�����⣬����Ҫ���ǵ����ú͵���ϣ���֤�߶ȵ�Э����
Ӧ��ʵ���� 1��������ʱ������ʦ�۲���߱�ۣ�Ȼ��֪ͨ�����������߾��ۡ� 2�����μ���������������������캢������������һ��ˮ����һ�����ڹ꣬����ڹ���ǹ۲��ߣ����۲�������ˮ���������
ʹ�ó����� 1���ж�����๲�еķ��������߼���ͬ�� 2����Ҫ�ġ����ӵķ��������Կ�����Ϊģ�巽����
ע����� 1��JAVA ���Ѿ����˶Թ۲���ģʽ��֧���ࡣ 2������ѭ�����á� 3�����˳��ִ�У�ĳһ�۲��ߴ���ᵼ��ϵͳ���ǣ�һ������첽��ʽ��
 * @author zjq
 *
 */
public class ObserverClient
{
    public static void main(String[] args)
    {
        WechatObserverableImpl server = new WechatObserverableImpl();
        
        //3���۲��ߣ�һ���Ƕ���û� 
        Observer userZhang = new UserObserverImpl("ZhangSan");
        Observer userLi = new UserObserverImpl("LiSi");
        Observer userWang = new UserObserverImpl("WangWu");
        
        server.registerObserver(userZhang);
        server.registerObserver(userLi);
        server.registerObserver(userWang);
        server.setInfomation("PHP������������õ����ԣ�");
        
        System.out.println("----------------------------------------------");
        server.removeObserver(userZhang);
        server.setInfomation("JAVA������������õ����ԣ�");
    }
}
