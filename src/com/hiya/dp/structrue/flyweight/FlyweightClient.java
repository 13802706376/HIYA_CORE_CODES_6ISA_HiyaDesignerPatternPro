package com.hiya.dp.structrue.flyweight;

/**
 * ��Ԫģʽ��Flyweight Pattern����Ҫ���ڼ��ٴ���������������Լ����ڴ�ռ�ú�������ܡ��������͵����ģʽ���ڽṹ��ģʽ�����ṩ�˼��ٶ��������Ӷ�����Ӧ������Ķ���ṹ�ķ�ʽ��
        ��Ԫģʽ�����������е�ͬ��������δ�ҵ�ƥ��Ķ����򴴽��¶������ǽ�ͨ������ 5 ������������ 20 ���ֲ��ڲ�ͬλ�õ�Բ����ʾ����ģʽ������ֻ�� 5 �ֿ��õ���ɫ������ color ���Ա�����������е� Circle ����
        ��ʱʹ�ã� 1��ϵͳ���д������� 2����Щ�������Ĵ����ڴ档 3����Щ�����״̬�󲿷ֿ����ⲿ���� 4����Щ������԰�������״̬��Ϊ�ܶ��飬�������̶���Ӷ������޳�����ʱ��ÿһ����󶼿�����һ�����������档 5��ϵͳ����������Щ������ݣ���Щ�����ǲ��ɷֱ�ġ�
        ��ν������Ψһ��ʶ���жϣ�������ڴ����У��򷵻����Ψһ��ʶ������ʶ�Ķ���
        �ؼ����룺�� HashMap �洢��Щ����
        Ӧ��ʵ���� 1��JAVA �е� String��������򷵻أ����û���򴴽�һ���ַ����������ַ�����������档 2�����ݿ�����ݳء�3��int��Integer 
        �ŵ㣺�����ٶ���Ĵ���������ϵͳ���ڴ棬ʹЧ����ߡ�
        ȱ�㣺�����ϵͳ�ĸ��Ӷȣ���Ҫ������ⲿ״̬���ڲ�״̬�������ⲿ״̬���й��л������ʣ���Ӧ�������ڲ�״̬�ı仯���仯����������ϵͳ�Ļ��ҡ�
 * @author zjq
 *
 */
public class FlyweightClient
{
    private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };
    public static void main(String[] args)
    {
        for (int i = 0; i < 20; ++i)
        {
            Circle circle = (Circle) CircleFlyweightFactory.getCircle(getRandomColor());
            circle.setX(getRandom());
            circle.setY(getRandom());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor()
    {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandom()
    {
        return (int) (Math.random() * 100);
    }
}
