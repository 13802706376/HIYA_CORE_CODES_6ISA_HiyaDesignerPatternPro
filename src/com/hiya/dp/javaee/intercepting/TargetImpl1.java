package com.hiya.dp.javaee.intercepting;

public class TargetImpl1 implements ITarget
{
    @Override
    public void execute(String request)
    {
        System.out.println("TargetImpl1"+request);
    }
}
