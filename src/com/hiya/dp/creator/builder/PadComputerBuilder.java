package com.hiya.dp.creator.builder;

/**
 * ƽ���
 * @author zjq
 *ʵ��Builder�ӿڣ���Բ�ͬ����ҵ�߼������廯���Ӷ���ĸ����ֵĴ����� �ڽ��������ɺ��ṩ��Ʒ��ʵ��
 */
public class PadComputerBuilder implements IComputerBuilder
{
    Computer computer;
    
    public PadComputerBuilder() {  
        computer = new Computer();
    } 
    
    @Override
    public void buildHostMachine()
    {
        computer.setHostMachine("ƽ�����װ����");
        System.out.println("ƽ�����װ����������");
    }

    @Override
    public void buildIoDevice()
    {
        computer.setIoDevice("ƽ�����װIO�豸");
        System.out.println("ƽ�����װIO�豸������");
    }

    @Override
    public void buildConnLine()
    {
        computer.setIoDevice("ƽ�����װ������");
        System.out.println("ƽ�����װ�����ߡ�����");
    }

    @Override
    public Computer buildComputer()
    {
        return computer;
    }
}
