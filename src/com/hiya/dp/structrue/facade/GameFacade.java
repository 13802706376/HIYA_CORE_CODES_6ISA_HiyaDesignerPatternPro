package com.hiya.dp.structrue.facade;

public class GameFacade  
{

    private IGame fightGame;    
    private IGame gunGame;    
    private IGame motorGame;
    
    public GameFacade()
    {
        this.fightGame = new FightGame();
        this.gunGame = new GunGame();
        this.motorGame = new MotorGame();
    }    
    
    public  void playFightGame()
    {
        fightGame.play();
    }
    
    public  void playGunGame()
    {
        gunGame.play();
    }
    
    public  void playMotorGame()
    {
        motorGame.play();
    }
}
