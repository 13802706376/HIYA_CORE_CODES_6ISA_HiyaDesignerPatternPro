package com.hiya.dp.creator.builder;

public class Computer
{
    //����
    private String hostMachine;  
    //io�豸
    private String ioDevice;  
    //������
    private String connLine;
    
    public String getHostMachine()
    {
        return hostMachine;
    }
    public void setHostMachine(String hostMachine)
    {
        this.hostMachine = hostMachine;
    }
    public String getIoDevice()
    {
        return ioDevice;
    }
    public void setIoDevice(String ioDevice)
    {
        this.ioDevice = ioDevice;
    }
    public String getConnLine()
    {
        return connLine;
    }
    public void setConnLine(String connLine)
    {
        this.connLine = connLine;
    }  
}