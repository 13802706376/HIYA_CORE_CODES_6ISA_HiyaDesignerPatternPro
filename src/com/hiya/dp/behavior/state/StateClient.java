package com.hiya.dp.behavior.state;

public class StateClient
{
    public static void main(String[] args)
    {
        CandyMachine mCandyMachine = new CandyMachine(6);
        mCandyMachine.printstate();
        mCandyMachine.insertCoin();
        mCandyMachine.printstate();
        mCandyMachine.turnCrank();
        mCandyMachine.printstate();
        mCandyMachine.insertCoin();
        mCandyMachine.printstate();
        mCandyMachine.turnCrank();
        mCandyMachine.printstate();
    }
}
