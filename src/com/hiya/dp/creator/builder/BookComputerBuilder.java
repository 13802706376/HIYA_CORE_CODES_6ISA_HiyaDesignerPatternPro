package com.hiya.dp.creator.builder;

/**
 * 笔记本
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
        computer.setHostMachine("笔记本组装主机");
        System.out.println("笔记本组装主机。。。");
    }

    @Override
    public void buildIoDevice()
    {
        computer.setIoDevice("笔记本组装IO设备");
        System.out.println("笔记本组装IO设备。。。");
    }

    @Override
    public void buildConnLine()
    {
        computer.setIoDevice("笔记本组装连接线");
        System.out.println("笔记本组装连接线。。。");
    }

    @Override
    public Computer buildComputer()
    {
        return computer;
    }
}
