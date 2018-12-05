package com.hiya.dp.creator.singleton;

public class DoubleCheckedLockSingleton
{
    private volatile static DoubleCheckedLockSingleton singleton;

    private DoubleCheckedLockSingleton()
    {
    }

    public static DoubleCheckedLockSingleton getSingleton()
    {
        //��һ���ж�
        if (singleton == null)
        {
            synchronized (DoubleCheckedLockSingleton.class)
            {
               //�ڶ����ж�
                if (singleton == null)
                {
                    singleton = new DoubleCheckedLockSingleton();
                }
            }
        }
        return singleton;
    }
}
