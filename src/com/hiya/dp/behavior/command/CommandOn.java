package com.hiya.dp.behavior.command;

/**
 * ����������������ܸ��µ� ���󣬵������еķ��� 
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
