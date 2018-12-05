package com.hiya.dp.creator.singleton;

public class LanhanSingleton
{
    private static LanhanSingleton instance;

    private LanhanSingleton()
    {
    }

    public static LanhanSingleton getInstance()
    {
        if (instance == null)
        {
            instance = new LanhanSingleton();
        }
        return instance;
    }
}
