package com.hiya.dp.behavior.mediator;

public class AbstractColleague
{
    protected String name;
    protected AbstractMediator mediator;

    public AbstractColleague(String name, AbstractMediator mediator)
    {
        this.name = name;
        this.mediator = mediator;
    }

}
