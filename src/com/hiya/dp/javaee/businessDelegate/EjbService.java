package com.hiya.dp.javaee.businessDelegate;

public class EjbService implements BusinessService
{
    @Override
    public void doProcessing() 
    {
         System.out.println("Processing task by invoking EJB Service");
    }
}
