package com.hiya.dp.javaee.intercepting;

public class LogFilter implements Filter
{
    public void execute(String request)
    {
        System.out.println("Authenticating request: " + request);
    }
}