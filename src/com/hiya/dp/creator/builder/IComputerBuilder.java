package com.hiya.dp.creator.builder;

/**
 * 给出一个抽象接口，以规范产品对象的各个组成成分的建造。这个接口规定要实现复杂对象的哪些部分的创建，并不涉及具体的对象部件的创建
 * @author zjq
 *
 */
public interface IComputerBuilder
{
    void buildHostMachine();
    void buildIoDevice();
    void buildConnLine();
    Computer buildComputer();
}
