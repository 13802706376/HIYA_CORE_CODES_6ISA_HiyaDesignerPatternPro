package com.hiya.dp.structrue.adapter;

public class VoltObjectAdapter implements IVoltUsa
{
    //����ԭ���һ��ʵ������Wrapper��ķ����У�����ʵ���ķ���
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
