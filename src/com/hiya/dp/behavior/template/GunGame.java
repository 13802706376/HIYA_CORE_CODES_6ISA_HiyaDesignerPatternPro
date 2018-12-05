package com.hiya.dp.behavior.template;

public class GunGame extends AbstractGame
{
    @Override
    void endPlay()
    {
        System.out.println("GunGame Game Finished!");
    }

    @Override
    void initialize()
    {
        System.out.println("GunGame Game Initialized! Start playing.");
    }

    @Override
    void startPlay()
    {
        System.out.println("GunGame Game Started. Enjoy the game!");
    }
}
