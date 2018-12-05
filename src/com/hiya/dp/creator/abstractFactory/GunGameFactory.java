package com.hiya.dp.creator.abstractFactory;
public class GunGameFactory
{
    public IGame getGame()
    {
        return new FightGame();
    }
}
