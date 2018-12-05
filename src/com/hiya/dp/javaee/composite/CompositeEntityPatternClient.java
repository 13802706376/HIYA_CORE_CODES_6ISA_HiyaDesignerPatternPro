package com.hiya.dp.javaee.composite;

/**
 * ���ʵ��ģʽ��Composite Entity Pattern������ EJB �־û������С�һ�����ʵ����һ�� EJB ʵ�� bean�������˶����ͼ�⡣������һ�����ʵ��ʱ���ڲ��������� beans ���Զ����£�
 * ��Ϊ�������� EJB ʵ�� bean ����ġ����������ʵ�� bean �Ĳ����ߡ�
    ���ʵ�壨Composite Entity�� - ������Ҫ��ʵ�� bean���������Ǵ����ģ����߿��԰���һ�������ȶ������ڳ����������ڡ�
    �����ȶ���Coarse-Grained Object�� - �ö�������������������Լ����������ڣ�Ҳ�ܹ�������������������ڡ�
    ��������Dependent Object�� - ����������һ�������������������ڴ����ȶ���Ķ���
    ���ԣ�Strategies�� - ���Ա�ʾ���ʵ�����ʵ�塣
 * @author zjq
 *
 */
public class CompositeEntityPatternClient
{
    public static void main(String[] args) 
    {
        CompositeEntity compositeEntity = new CompositeEntity();
        compositeEntity.setData("Test", "Data");
        compositeEntity.printData();
        
        compositeEntity.setData("Second Test", "Data1");
        compositeEntity.printData();
    }
}
