package com.hiya.dp.creator.singleton;

public class LanhanThreadSingleton
{
    private static LanhanThreadSingleton instance;

    private LanhanThreadSingleton()
    {
    }

    public static synchronized LanhanThreadSingleton getInstance()
    {
        if (instance == null)
        {
            instance = new LanhanThreadSingleton();
        }
        return instance;
    }
}
