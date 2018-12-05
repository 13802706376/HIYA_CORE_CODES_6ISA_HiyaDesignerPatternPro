package com.hiya.dp.behavior.interpret;

public class Constant implements Expression
{
    private boolean value;

    public Constant(boolean value)
    {
        this.value = value;
    }
    
    @Override
    public boolean interpret(Context ctx)
    {
        return value;
    }
}
