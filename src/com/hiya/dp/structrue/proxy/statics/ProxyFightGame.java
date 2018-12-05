package com.hiya.dp.structrue.proxy.statics;

import com.hiya.dp.structrue.proxy.FightGame;
import com.hiya.dp.structrue.proxy.IGame;

public class ProxyFightGame implements IGame
{
    private FightGame fightGame;
    private String fileName;

    public ProxyFightGame(String fileName)
    {
        this.fileName = fileName;
    }
    
    @Override
    public void play()
    {
        if(fightGame == null)
        {
            fightGame = new FightGame(fileName);
         }
        fightGame.play();
    }
}