package com.hiya.dp.structrue.proxy;

public class MotorGame implements IGame
{
    private String fileName;

    @Override
    public void play()
    {
        System.out.println("This is MotorGame¡£¡£¡£" + this.fileName);
    }

    public MotorGame(String fileName)
    {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName)
    {
        System.out.println("Loading " + fileName);
    }
}