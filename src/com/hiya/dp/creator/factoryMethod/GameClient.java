package com.hiya.dp.creator.factoryMethod;

public class GameClient
{
    public static void main(String[] args)
    {
        GameFactory shapeFactory = new GameFactory();

        // 获取 FightGame 的对象，并调用它的 play 方法
        IGame faghtGame = shapeFactory.getGame("Fight");
        faghtGame.play();

        // 获取 GunGame 的对象，并调用它的 play 方法
        IGame gunGame = shapeFactory.getGame("Gun");
        gunGame.play();

        // 获取 MotorGame 的对象，并调用它的 play 方法
        IGame motorGame = shapeFactory.getGame("Motor");
        motorGame.play();
    }
}
