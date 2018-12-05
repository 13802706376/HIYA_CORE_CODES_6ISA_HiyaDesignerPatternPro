package com.hiya.dp.creator.abstractFactory;
public class FightGameFactory
{
    public IGame getGame()
    {
        return new FightGame();
    }
}
