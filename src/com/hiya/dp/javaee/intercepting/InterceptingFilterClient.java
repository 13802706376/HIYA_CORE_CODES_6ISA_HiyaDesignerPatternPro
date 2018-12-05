package com.hiya.dp.javaee.intercepting;

/**
 * ���ع�����ģʽ��Intercepting Filter Pattern�����ڶ�Ӧ�ó�����������Ӧ��һЩԤ����/������������������ڰ����󴫸�ʵ��Ŀ��Ӧ�ó���֮ǰӦ���������ϡ�
 * ��������������֤/��Ȩ/��¼��־�����߸�������Ȼ������󴫸���Ӧ�Ĵ�������������������ģʽ��ʵ�塣
    ��������Filter�� - �����������������ִ������֮ǰ��֮��ִ��ĳЩ����
    ����������Filter Chain�� - �����������ж�������������� Target �ϰ��ն����˳��ִ����Щ��������
    Target - Target ���������������
    ���˹�������Filter Manager�� - ���˹���������������͹���������
    �ͻ��ˣ�Client�� - Client ���� Target ����������Ķ���
 * @author zjq
 *
 */
public class InterceptingFilterClient
{
    public static void main(String[] args)
    {
        FilterManager filterManager = new FilterManager(new TargetImpl1());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new LogFilter());
        filterManager.sendRequest("HOME");
    }
}
