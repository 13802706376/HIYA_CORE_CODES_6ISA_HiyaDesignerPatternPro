package com.hiya.dp.behavior.strategy;

public class Context
{
    ICalculateStrategy mStrategy;

    public void setStrategy(ICalculateStrategy mStrategy)
    {
        this.mStrategy = mStrategy;
    }

    public int calculatePrice(int km)
    {
        return mStrategy.calculatePrice(km);
    }

}
