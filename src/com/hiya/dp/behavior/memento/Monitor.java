package com.hiya.dp.behavior.memento;

/**
 * 监控管理类，负责保存状态 
 * @author zjq
 *
 */
public class Monitor
{
    private Memento memento;

    /**
     * 备忘录的取值方法
     */
    public Memento retrieveMemento()
    {
        return this.memento;
    }

    /**
     * 备忘录的赋值方法
     */
    public void saveMemento(Memento memento)
    {
        this.memento = memento;
    }
}
