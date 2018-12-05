package com.hiya.dp.behavior.command;

/**
 * 命令模式（Command Pattern）是一种数据驱动的设计模式，它属于行为型模式。请求以命令的形式包裹在对象中，并传给调用对象。调用对象寻找可以处理该命令的合适的对象，并把该命令传给相应的对象，该对象执行命令。
主要解决：在软件系统中，行为请求者与行为实现者通常是一种紧耦合的关系，但某些场合，比如需要对行为进行记录、撤销或重做、事务等处理时，这种无法抵御变化的紧耦合的设计就不太合适。
何时使用：在某些场合，比如要对行为进行"记录、撤销/重做、事务"等处理，这种无法抵御变化的紧耦合是不合适的。在这种情况下，如何将"行为请求者"与"行为实现者"解耦？将一组行为抽象为对象，可以实现二者之间的松耦合。

适用情况
1.系统需要将请求调用者和请求接收者解耦，使得调用者和接收者不直接交互。
2.系统需要在不同的时间指定请求、将请求排队和执行请求。
3.系统需要支持命令的撤销(Undo)操作和恢复(Redo)操作。
4.系统需要将一组操作组合在一起，即支持宏命令。

角色
Command
定义命令的接口，声明执行的方法。
ConcreteCommand
命令接口实现对象，是“虚”的实现；通常会持有接收者，并调用接收者的功能来完成命令要执行的操作。
Receiver
接收者，真正执行命令的对象。任何类都可能成为一个接收者，只要它能够实现命令要求实现的相应功能。
Invoker
要求命令对象执行请求，通常会持有命令对象，可以持有很多的命令对象。这个是客户端真正触发命令并要求命令执行相应操作的地方，也就是说相当于使用命令对象的入口。
Client
创建具体的命令对象，并且设置命令对象的接收者。注意这个不是我们常规意义上的客户端，而是在组装命令对象和接收者，或许，把这个Client称为装配者会更好理解，因为真正使用命令的客户端是从Invoker来触发执行。
 * @author zjq
 *
 */
public class CommandClient
{
    /**
     * 模拟activiti的命令模式 
     * @param args
     */
    public static void main(String[] args)
    {
        //初始化命令执行器 ，注入命令上下文
        ICommandExecutor CommandExecutor = new CommandExecutorImpl(new CommandContext());
        //传参不同的 命令
        CommandExecutor.excute(new CommandOn());
        CommandExecutor.excute(new CommandOff());
        CommandExecutor.excute(new CommandChangeChanel(3));
    }
}
