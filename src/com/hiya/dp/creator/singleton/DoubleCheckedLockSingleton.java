package com.hiya.dp.creator.singleton;

public class DoubleCheckedLockSingleton
{
    private volatile static DoubleCheckedLockSingleton singleton;

    private DoubleCheckedLockSingleton()
    {
    }

    public static DoubleCheckedLockSingleton getSingleton()
    {
        //第一次判断
        if (singleton == null)
        {
            synchronized (DoubleCheckedLockSingleton.class)
            {
               //第二次判断
                if (singleton == null)
                {
                    singleton = new DoubleCheckedLockSingleton();
                }
            }
        }
        return singleton;
    }
}
