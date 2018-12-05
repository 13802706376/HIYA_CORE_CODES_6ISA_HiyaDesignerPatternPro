package com.hiya.dp.behavior.command;

/**
 * 接受者命令上下文，能够干事的，相当于runtimeService的 启动流程，终止，暂停 ，删除流程操作 
 * @author zjq
 *
 */
public class CommandContext
{
    public int currentChannel = 0;

    public void turnOn()
    {
        System.out.println("The televisino is on.");
    }

    public void turnOff()
    {
        System.out.println("The television is off.");
    }

    public void changeChannel(int channel)
    {
        this.currentChannel = channel;
        System.out.println("Now TV channel is " + channel);
    }
}
