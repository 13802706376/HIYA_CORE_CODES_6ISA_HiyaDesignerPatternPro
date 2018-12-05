package com.hiya.dp.creator.singleton;

public class EhanSingleton
{
    private static EhanSingleton instance = new EhanSingleton();

    private EhanSingleton()
    {
    }

    public static EhanSingleton getInstance()
    {
        return instance;
    }
}
