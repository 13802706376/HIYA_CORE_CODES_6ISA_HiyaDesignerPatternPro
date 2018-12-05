package com.hiya.dp.creator.builder;

/**
 * 建造者模式：是将一个复杂的对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
工厂类模式提供的是创建单个类的模式，而建造者模式则是将各种产品集中起来进行管理，用来创建复合对象，所谓复合对象就是指某个类具有不同的属性，其实建造者模式就是前面抽象工厂模式和最后的Test结合起来得到的。
    应用实例：
    1、台式机，笔记本，平板各自有构建主机，构建输入输出，构建连接线的步骤产生对象。 
    2、JAVA 中的 StringBuilder。
    使用场景： 
    1、需要生成的对象具有复杂的内部结构。 
    2、需要生成的对象内部属性本身相互依赖。
    与工厂模式的区别是：建造者模式更加关注与零件装配的顺序。
 * @author zjq
 *
 */
public class BuilderClient
{
    public static void main(String[] args)
    {
        ComputerDirector pd = new ComputerDirector();  
        Computer padComputer = pd.constructComputer(new PadComputerBuilder());  
        System.out.println(padComputer.getHostMachine());  
        System.out.println(padComputer.getIoDevice());  
        System.out.println(padComputer.getConnLine());  
        
        Computer tableComputer  = pd.constructComputer(new TableComputerBuilder());  
        System.out.println(tableComputer.getHostMachine());  
        System.out.println(tableComputer.getIoDevice());  
        System.out.println(tableComputer.getConnLine()); 
        
        Computer bookComputer  = pd.constructComputer(new BookComputerBuilder());  
        System.out.println(bookComputer.getHostMachine());  
        System.out.println(bookComputer.getIoDevice());  
        System.out.println(bookComputer.getConnLine()); 
    }
}
