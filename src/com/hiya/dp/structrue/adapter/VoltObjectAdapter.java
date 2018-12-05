package com.hiya.dp.structrue.adapter;

public class VoltObjectAdapter implements IVoltUsa
{
    //持有原类的一个实例，在Wrapper类的方法中，调用实例的方法
    VoltChina voltChina;
    
    public VoltObjectAdapter(VoltChina voltChina) {
        this.voltChina = voltChina;
    }
    
    @Override
    public int getVolt110() 
    {
        return 110;
    }
    
    public int getVolt220() 
    {
        return voltChina.getVolt220();
    }
}
