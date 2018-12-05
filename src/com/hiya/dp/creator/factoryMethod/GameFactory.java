package com.hiya.dp.creator.factoryMethod;

public class GameFactory
{
    public IGame getGame(String gameType)
    {
        if (gameType == null)
        {
            return null;
        }
        if (gameType.equalsIgnoreCase("Fight"))
        {
            return new FightGame();
        } else if (gameType.equalsIgnoreCase("Gun"))
        {
            return new GunGame();
        } else if (gameType.equalsIgnoreCase("Motor"))
        {
            return new MotorGame();
        }
        return null;
    }

}
