package com.hiya.dp.creator.builder;

/**
 * ���þ��彨�������������Ӷ���ĸ������֣���ָ�����в��漰�����Ʒ����Ϣ��ֻ����֤�������������������ĳ��˳�򴴽�
 * @author zjq
 *
 */
public class ComputerDirector
{
    public Computer constructComputer(IComputerBuilder pb) {  
        //���� ����--->�������--->������ ��˳�򴴽�����
        pb.buildHostMachine();
        pb.buildIoDevice();
        pb.buildConnLine();
        return pb.buildComputer();
    }  
}
