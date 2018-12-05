package com.hiya.dp.behavior.command;

/**
 * ����������������ܸ��µ� ���󣬵������еķ��� 
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
