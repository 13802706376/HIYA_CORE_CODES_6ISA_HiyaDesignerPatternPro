package com.hiya.dp.behavior.command;


/**
 * ÃüÁî½Ó¿Ú
 * @author zjq
 *
 */
public interface Command<T>
{
     T execute(CommandContext commandContext); 
}
