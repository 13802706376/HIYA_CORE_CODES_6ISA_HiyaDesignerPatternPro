package com.hiya.dp.javaee.composite;

public class CompositeEntity
{
    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String data1, String data2)
    {
       cgo.setData(data1, data2);
    }

    public String[] getData()
    {
       return cgo.getData();
    }
    
    public void printData()
    {
        for (int i = 0; i < getData().length; i++) 
        {
           System.out.println("Data: " + getData()[i]);
        }
     }
}
