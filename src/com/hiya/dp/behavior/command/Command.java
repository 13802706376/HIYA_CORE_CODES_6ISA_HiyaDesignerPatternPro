package com.hiya.dp.behavior.command;


/**
 * ����ӿ�
 * @author zjq
 *
 */
public interface Command<T>
{
     T execute(CommandContext commandContext); 
}
