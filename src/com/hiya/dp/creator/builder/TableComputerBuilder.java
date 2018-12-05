package com.hiya.dp.creator.builder;

/**
 * ̨ʽ��
 * @author zjq
 *
 */
public class TableComputerBuilder implements IComputerBuilder
{
    Computer computer;
    
    public TableComputerBuilder() {  
        computer = new Computer();
    } 
    
    @Override
    public void buildHostMachine()
    {
        computer.setHostMachine("̨ʽ����װ����");
        System.out.println("̨ʽ����װ����������");
    }

    @Override
    public void buildIoDevice()
    {
        computer.setIoDevice("̨ʽ����װIO�豸");
        System.out.println("̨ʽ����װIO�豸������");
    }

    @Override
    public void buildConnLine()
    {
        computer.setIoDevice("̨ʽ����װ������");
        System.out.println("̨ʽ����װ�����ߡ�����");
    }

    @Override
    public Computer buildComputer()
    {
        return computer;
    }
}
