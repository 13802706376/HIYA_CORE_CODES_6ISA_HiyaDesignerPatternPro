package com.hiya.dp.structrue.proxy;

public class FightGame implements IGame
{
    private String fileName;

    @Override
    public void play()
    {
        System.out.println("This is FightGame¡£¡£¡£" + this.fileName);
    }

    public FightGame(String fileName)
    {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName)
    {
        System.out.println("Loading " + fileName);
    }
}