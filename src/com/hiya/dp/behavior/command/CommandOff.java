package com.hiya.dp.behavior.command;

/**
 * ����������������ܸ��µ� ���󣬵������еķ��� 
 * @author zjq
 *
 */
public class CommandOff  implements Command<String>
{
    public String execute(CommandContext commandContext)
    {
         commandContext.turnOff();
         return null;
    }
}
