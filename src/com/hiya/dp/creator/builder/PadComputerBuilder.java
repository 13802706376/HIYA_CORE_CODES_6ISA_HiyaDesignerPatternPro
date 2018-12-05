package com.hiya.dp.creator.builder;

/**
 * 平板机
 * @author zjq
 *实现Builder接口，针对不同的商业逻辑，具体化复杂对象的各部分的创建。 在建造过程完成后，提供产品的实例
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
        computer.setHostMachine("平板机组装主机");
        System.out.println("平板机组装主机。。。");
    }

    @Override
    public void buildIoDevice()
    {
        computer.setIoDevice("平板机组装IO设备");
        System.out.println("平板机组装IO设备。。。");
    }

    @Override
    public void buildConnLine()
    {
        computer.setIoDevice("平板机组装连接线");
        System.out.println("平板机组装连接线。。。");
    }

    @Override
    public Computer buildComputer()
    {
        return computer;
    }
}
