package com.hiya.dp.behavior.nullobj;

public class CustomerFactory
{
    public static final String[] names =  { "Rob", "Joe", "Julie" };

    public static AbstractCustomer getCustomer(String name)
    {
        for (int i = 0; i < names.length; i++)
        {
            if (names[i].equalsIgnoreCase(name))
            {
                return new ShopCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
