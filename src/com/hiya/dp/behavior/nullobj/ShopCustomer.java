package com.hiya.dp.behavior.nullobj;

public class ShopCustomer extends AbstractCustomer
{

    public ShopCustomer(String name) {
        this.name = name;     
     }
    
    @Override
    public boolean isNil()
    {
        return false;
    }

    @Override
    public String getName()
    {
        return name;
    }

}
