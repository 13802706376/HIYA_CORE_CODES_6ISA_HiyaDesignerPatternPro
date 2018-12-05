package com.hiya.dp.javaee.intercepting;

public class AuthenticationFilter implements Filter
{
    public void execute(String request)
    {
        System.out.println("Authenticating request: " + request);
    }
}