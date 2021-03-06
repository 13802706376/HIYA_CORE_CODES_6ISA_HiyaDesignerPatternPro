package com.hiya.dp.creator.singleton;

public class StaticInnerClassSingleton
{
    private static class SingletonHolder
    {
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }

    private StaticInnerClassSingleton()
    {
    }

    public static final StaticInnerClassSingleton getInstance()
    {
        return SingletonHolder.INSTANCE;
    }
}
