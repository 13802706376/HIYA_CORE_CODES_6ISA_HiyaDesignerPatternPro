package com.hiya.dp.behavior.iterator;

public class HiyaIterator implements Iterator
{
    private List list = null;
    private int index;

    public HiyaIterator(List list)
    {
        super();
        this.list = list;
    }

    @Override
    public boolean hasNext()
    {
        if (index >= list.getSize())
        {
            return false;
        } else
        {
            return true;
        }
    }

    @Override
    public Object next()
    {
        Object object = list.get(index);
        index++;
        return object;
    }

}