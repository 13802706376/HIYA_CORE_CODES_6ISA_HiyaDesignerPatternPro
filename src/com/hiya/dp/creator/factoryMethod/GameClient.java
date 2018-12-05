package com.hiya.dp.creator.factoryMethod;

public class GameClient
{
    public static void main(String[] args)
    {
        GameFactory shapeFactory = new GameFactory();

        // ��ȡ FightGame �Ķ��󣬲��������� play ����
        IGame faghtGame = shapeFactory.getGame("Fight");
        faghtGame.play();

        // ��ȡ GunGame �Ķ��󣬲��������� play ����
        IGame gunGame = shapeFactory.getGame("Gun");
        gunGame.play();

        // ��ȡ MotorGame �Ķ��󣬲��������� play ����
        IGame motorGame = shapeFactory.getGame("Motor");
        motorGame.play();
    }
}
