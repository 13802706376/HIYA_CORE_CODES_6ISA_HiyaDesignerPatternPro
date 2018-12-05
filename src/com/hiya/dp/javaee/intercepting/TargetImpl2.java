package com.hiya.dp.javaee.intercepting;

public class TargetImpl2 implements ITarget
{
    @Override
    public void execute(String request)
    {
        System.out.println("TargetImpl2"+request);
    }
}
