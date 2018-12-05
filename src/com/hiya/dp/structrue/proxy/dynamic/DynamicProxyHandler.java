package com.hiya.dp.structrue.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxyHandler implements InvocationHandler
{
    private Object realObject;

    public DynamicProxyHandler(Object realObject)
    {
        this.realObject = realObject;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        System.out.println("开始事物。。。。");
        Object obj =  method.invoke(realObject, args);
        System.out.println("提交事物。。。。");
        return obj;
    }
}