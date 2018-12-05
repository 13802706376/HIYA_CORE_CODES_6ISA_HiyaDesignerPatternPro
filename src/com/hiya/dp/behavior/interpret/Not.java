package com.hiya.dp.behavior.interpret;

public class Not implements Expression
{
    private Expression exp;

    public Not(Expression exp)
    {
        this.exp = exp;
    }

    @Override
    public boolean interpret(Context ctx)
    {
        return !exp.interpret(ctx);
    }

    @Override
    public String toString()
    {
        return "(Not " + exp.toString() + ")";
    }
}
