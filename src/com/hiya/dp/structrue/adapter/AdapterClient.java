package com.hiya.dp.structrue.adapter;

/**
 * �ṹ��ģʽ, �ڲ��޸�ԭ������ģ�����������,�����������ݵ����ں���һ��,�е���ճ�ϼ�,ͨ��ת��ʹ�������ܹ�Э������, �����˿���ԭ��.��ĳ����Ľӿ�ת���ɿͻ�����������һ���ӿڱ�ʾ��Ŀ�����������ڽӿڲ�ƥ������ɵ���ļ��������⡣��Ҫ��Ϊ���ࣺ���������ģʽ�������������ģʽ���ӿڵ�������ģʽ��
    
    ��������ͨ���̳�,�Ǿ�̬�Ķ��巽ʽ����ϣ����һ����ת����������һ���½ӿڵ���ʱ������ʹ�����������ģʽ������һ�����࣬�̳�ԭ�е��࣬ʵ���µĽӿڼ���
    ����������ͨ������,�Ƕ�̬��ϵķ�ʽ����ϣ����һ������ת����������һ���½ӿڵĶ���ʱ�����Դ���һ��Wrapper�࣬����ԭ���һ��ʵ������Wrapper��ķ����У�����ʵ���ķ������С�
    �ӿ�����������ϣ��ʵ��һ���ӿ������еķ���ʱ�����Դ���һ��������Wrapper��ʵ�����з���������д������ʱ�򣬼̳г����༴�ɡ�
 * @author zjq
 *
 */
public class AdapterClient
{

    public static void main(String[] args)
    {
        //����������ͨ���̳�,�Ǿ�̬�Ķ��巽ʽ����ϣ����һ����ת����������һ���½ӿڵ���ʱ������ʹ�����������ģʽ������һ�����࣬�̳�ԭ�е��࣬ʵ���µĽӿ�
        VoltClassAdapter voltClassAdapter = new VoltClassAdapter();
        System.out.println(voltClassAdapter.getVolt110());
        System.out.println(voltClassAdapter.getVolt220());
        
        //������������ͨ������,�Ƕ�̬��ϵķ�ʽ����ϣ����һ������ת����������һ���½ӿڵĶ���ʱ�����Դ���һ��Wrapper�࣬����ԭ���һ��ʵ������Wrapper��ķ����У�����ʵ���ķ���
        VoltObjectAdapter voltObjectAdapter = new VoltObjectAdapter(new VoltChina());
        System.out.println(voltObjectAdapter.getVolt110());
        System.out.println(voltObjectAdapter.getVolt220());
        
        //�ӿ�������������ϣ��ʵ��һ���ӿ������еķ���ʱ�����Դ���һ��������Wrapper��ʵ�����з���������д������ʱ�򣬼̳г����༴��
        VoltInterfaceTargetAdapter voltInterfaceTargetAdapter = new VoltInterfaceTargetAdapter();
        voltInterfaceTargetAdapter.FTP();
    }
}
