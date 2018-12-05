package com.hiya.dp.behavior.visitor;

public interface ComputerPart
{
    public void accept(ComputerPartVisitor computerPartVisitor);
}
