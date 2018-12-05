package com.hiya.dp.behavior.mediator;

public class MediatorImpl extends AbstractMediator
{
    ColleagueA collA;
    ColleagueB collB;

    public ColleagueA getCollA()
    {
        return collA;
    }

    public void setCollA(ColleagueA collA)
    {
        this.collA = collA;
    }

    public ColleagueB getCollB()
    {
        return collB;
    }

    public void setCollB(ColleagueB collB)
    {
        this.collB = collB;
    }

    @Override
    public void contact(String content, AbstractColleague coll)
    {
        if (coll == collA)
        {
            collB.getMessage(content);
        } else
        {
            collA.getMessage(content);
        }
    }
}