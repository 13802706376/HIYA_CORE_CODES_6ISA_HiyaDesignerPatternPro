package com.hiya.dp.javaee.businessDelegate;

public class JmsService implements BusinessService
{
    @Override
    public void doProcessing() 
    {
         System.out.println("Processing task by invoking Jms Service");
    }
}
