package com.hiya.dp.behavior.template;

public class FightGame extends AbstractGame
{
    @Override
    void endPlay()
    {
        System.out.println("FightGame Game Finished!");
    }

    @Override
    void initialize()
    {
        System.out.println("FightGame Game Initialized! Start playing.");
    }

    @Override
    void startPlay()
    {
        System.out.println("FightGame Game Started. Enjoy the game!");
    }
}
