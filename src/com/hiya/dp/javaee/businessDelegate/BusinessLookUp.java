package com.hiya.dp.javaee.businessDelegate;

public class BusinessLookUp
{
    public BusinessService getBusinessService(String serviceType)
    {
        if (serviceType.equalsIgnoreCase("EJB"))
        {
            return new EjbService();
        } else
        {
            return new JmsService();
        }
    }

}
