package com.hiya.dp.creator.builder;

public class Computer
{
    //主机
    private String hostMachine;  
    //io设备
    private String ioDevice;  
    //连接线
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