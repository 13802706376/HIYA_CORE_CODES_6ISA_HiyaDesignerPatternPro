package com.hiya.dp.behavior.command;

public class CommandExecutorImpl implements ICommandExecutor
{
    private CommandContext commandContext;
    public CommandExecutorImpl(CommandContext commandContext)
    {
        this.commandContext = commandContext;
    }
    
    @Override
    public void excute(Command<?> command)
    {
        command.execute( commandContext);
    }
}
