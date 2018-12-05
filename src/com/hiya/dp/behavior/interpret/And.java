package com.hiya.dp.behavior.interpret;

public class And implements Expression
{
    private Expression left, right;

    public And(Expression left, Expression right)
    {
        this.left = left;
        this.right = right;
    }
  
    @Override
    public boolean interpret(Context ctx)
    {
        return left.interpret(ctx) && right.interpret(ctx);
    }

    @Override
    public String toString()
    {
        return "(" + left.toString() + " AND " + right.toString() + ")";
    }
}
