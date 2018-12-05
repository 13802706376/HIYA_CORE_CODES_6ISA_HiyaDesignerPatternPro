package com.hiya.dp.behavior.strategy.old;

/**
 * 如果再添加一种出租车的价格计算，添加相应的代码：
 * 
 * // 计算出租车价格 private int taxiprice(int km) { return km * 2; }
 * 
 * // 根据类型来计算相应的价格 private int calculatePrice(int km, int type) { if (type ==
 * BUS) { return busPrice(km); } else if (type == SUBWAY) { return
 * subwayPrice(km); } else { return taxiprice(km); } }
 * 
 * 可见上面的代码耦合性较高，每当增加新的交通工具类型的时候，需要不断的修改大量的代码，这里使用策略模式重构：
 * @author zjq
 *
 */
public class PriceCalculator
{
    // 公交车类型
    private static final int BUS = 1;
    // 地铁类型
    private static final int SUBWAY = 2;

    public static void main(String[] args)
    {
        PriceCalculator calculator = new PriceCalculator();
        System.out.println("坐10公里的公交车的票价为：" + calculator.calculatePrice(10, BUS));
        System.out.println("坐10公里的地铁的票价为：" + calculator.calculatePrice(10, SUBWAY));
    }

    // 计算公交价格
    private int busPrice(int km)
    {
        int extraTotal = km - 10;
        int extraFactor = extraTotal / 5;
        int fraction = extraTotal % 5;
        int price = 1 + extraFactor * 1;
        return fraction > 0 ? ++price : price;
    }

    // 计算地铁价格
    private int subwayPrice(int km)
    {
        if (km <= 6)
        {
            return 3;
        } else if (km > 6 && km < 12)
        {
            return 4;
        } else if (km < 22 && km > 12)
        {
            return 5;
        } else if (km < 32 && km > 22)
        {
            return 6;
        }
        return 7;
    }

    // 根据类型来计算相应的价格
    private int calculatePrice(int km, int type)
    {
        if (type == BUS)
        {
            return busPrice(km);
        } else
        {
            return subwayPrice(km);
        }
    }
}