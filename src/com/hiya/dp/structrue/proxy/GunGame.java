package com.hiya.dp.structrue.proxy;

public class GunGame implements IGame
{
    private String fileName;

    @Override
    public void play()
    {
        System.out.println("This is GunGame¡£¡£¡£" + this.fileName);
    }

    public GunGame(String fileName)
    {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName)
    {
        System.out.println("Loading " + fileName);
    }
}