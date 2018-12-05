package com.hiya.dp.creator.builder;

/**
 * 调用具体建造者来创建复杂对象的各个部分，在指导者中不涉及具体产品的信息，只负责保证对象各部分完整创建或按某种顺序创建
 * @author zjq
 *
 */
public class ComputerDirector
{
    public Computer constructComputer(IComputerBuilder pb) {  
        //按照 主机--->输入输出--->连接线 的顺序创建电脑
        pb.buildHostMachine();
        pb.buildIoDevice();
        pb.buildConnLine();
        return pb.buildComputer();
    }  
}
