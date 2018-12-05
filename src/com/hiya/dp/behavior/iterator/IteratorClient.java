package com.hiya.dp.behavior.iterator;

public class IteratorClient
{
    public static void main(String[] args)
    {
        List list = new HiyaList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        Iterator it = list.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
