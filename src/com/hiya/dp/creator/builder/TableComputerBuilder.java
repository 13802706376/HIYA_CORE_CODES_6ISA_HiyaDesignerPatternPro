package com.hiya.dp.creator.builder;

/**
 * 台式机
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
        computer.setHostMachine("台式机组装主机");
        System.out.println("台式机组装主机。。。");
    }

    @Override
    public void buildIoDevice()
    {
        computer.setIoDevice("台式机组装IO设备");
        System.out.println("台式机组装IO设备。。。");
    }

    @Override
    public void buildConnLine()
    {
        computer.setIoDevice("台式机组装连接线");
        System.out.println("台式机组装连接线。。。");
    }

    @Override
    public Computer buildComputer()
    {
        return computer;
    }
}
