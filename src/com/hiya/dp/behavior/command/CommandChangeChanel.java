package com.hiya.dp.behavior.command;

/**
 * 启动流程命令，持有能干事的 对象，调用其中的方法 
 * @author zjq
 *
 */
public class CommandChangeChanel  implements Command<String>
{
    private int channel;
    
    public CommandChangeChanel(int channel)
    {
        this.channel = channel;
    }
    
    public String execute(CommandContext commandContext)
    {
         commandContext.changeChannel(channel);
         return null;
    }
}
