package com.hiya.dp.creator.builder;

/**
 * �ʼǱ�
 * @author zjq
 *
 */
public class BookComputerBuilder implements IComputerBuilder
{
    Computer computer;
    
    public BookComputerBuilder() {  
        computer = new Computer();
    } 
    
    @Override
    public void buildHostMachine()
    {
        computer.setHostMachine("�ʼǱ���װ����");
        System.out.println("�ʼǱ���װ����������");
    }

    @Override
    public void buildIoDevice()
    {
        computer.setIoDevice("�ʼǱ���װIO�豸");
        System.out.println("�ʼǱ���װIO�豸������");
    }

    @Override
    public void buildConnLine()
    {
        computer.setIoDevice("�ʼǱ���װ������");
        System.out.println("�ʼǱ���װ�����ߡ�����");
    }

    @Override
    public Computer buildComputer()
    {
        return computer;
    }
}
