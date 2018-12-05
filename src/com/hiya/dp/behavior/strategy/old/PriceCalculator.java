package com.hiya.dp.behavior.strategy.old;

/**
 * ��������һ�ֳ��⳵�ļ۸���㣬�����Ӧ�Ĵ��룺
 * 
 * // ������⳵�۸� private int taxiprice(int km) { return km * 2; }
 * 
 * // ����������������Ӧ�ļ۸� private int calculatePrice(int km, int type) { if (type ==
 * BUS) { return busPrice(km); } else if (type == SUBWAY) { return
 * subwayPrice(km); } else { return taxiprice(km); } }
 * 
 * �ɼ�����Ĵ�������Խϸߣ�ÿ�������µĽ�ͨ�������͵�ʱ����Ҫ���ϵ��޸Ĵ����Ĵ��룬����ʹ�ò���ģʽ�ع���
 * @author zjq
 *
 */
public class PriceCalculator
{
    // ����������
    private static final int BUS = 1;
    // ��������
    private static final int SUBWAY = 2;

    public static void main(String[] args)
    {
        PriceCalculator calculator = new PriceCalculator();
        System.out.println("��10����Ĺ�������Ʊ��Ϊ��" + calculator.calculatePrice(10, BUS));
        System.out.println("��10����ĵ�����Ʊ��Ϊ��" + calculator.calculatePrice(10, SUBWAY));
    }

    // ���㹫���۸�
    private int busPrice(int km)
    {
        int extraTotal = km - 10;
        int extraFactor = extraTotal / 5;
        int fraction = extraTotal % 5;
        int price = 1 + extraFactor * 1;
        return fraction > 0 ? ++price : price;
    }

    // ��������۸�
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

    // ����������������Ӧ�ļ۸�
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