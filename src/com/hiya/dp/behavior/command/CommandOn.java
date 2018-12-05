package com.hiya.dp.behavior.command;

/**
 * 启动流程命令，持有能干事的 对象，调用其中的方法 
 * @author zjq
 *
 */
public class CommandOn implements Command<String>
{
    public String execute(CommandContext commandContext)
    {
         commandContext.turnOn();
         return null;
    }
}
