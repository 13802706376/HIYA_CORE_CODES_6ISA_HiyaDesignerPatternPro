package com.hiya.dp.javaee.frontController;

/**
 * ǰ�˿�����ģʽ��Front Controller Pattern���������ṩһ�����е���������ƣ����е����󶼽���һ����һ�Ĵ���������ô�������������֤/��Ȩ/��¼��־��
 * ���߸�������Ȼ������󴫸���Ӧ�Ĵ�������������������ģʽ��ʵ�塣
        ǰ�˿�������Front Controller�� - ����Ӧ�ó���������������ĵ����������Ӧ�ó�������ǻ��� web ��Ӧ�ó���Ҳ�����ǻ��������Ӧ�ó���
        ��������Dispatcher�� - ǰ�˿���������ʹ��һ������������������������Ӧ�ľ��崦�����
        ��ͼ��View�� - ��ͼ��Ϊ����������Ķ���
 * @author zjq
 *
 */
public class FrontControllerPatternClient
{
    public static void main(String[] args) 
    {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
     }
}
