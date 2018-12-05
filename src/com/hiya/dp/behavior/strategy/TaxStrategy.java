package com.hiya.dp.behavior.strategy;

public class TaxStrategy implements ICalculateStrategy
{
    @Override
    public int calculatePrice(int km)
    {
        int extraTotal = km - 10;
        int extraFactor = extraTotal / 4;
        int fraction = extraTotal % 6;
        int price = 1 + extraFactor * 1;
        return fraction > 0 ? ++price : price;
    }
}
