package com.hiya.dp.behavior.memento;

/**
 * ��ع����࣬���𱣴�״̬ 
 * @author zjq
 *
 */
public class Monitor
{
    private Memento memento;

    /**
     * ����¼��ȡֵ����
     */
    public Memento retrieveMemento()
    {
        return this.memento;
    }

    /**
     * ����¼�ĸ�ֵ����
     */
    public void saveMemento(Memento memento)
    {
        this.memento = memento;
    }
}
