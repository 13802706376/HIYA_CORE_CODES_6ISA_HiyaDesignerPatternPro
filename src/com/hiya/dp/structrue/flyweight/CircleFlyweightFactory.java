package com.hiya.dp.structrue.flyweight;

import java.util.HashMap;

public class CircleFlyweightFactory
{
    private static final HashMap<String, Circle> circleMap = new HashMap<String, Circle>();
    public static Circle getCircle(String color)
    {
        Circle circle = (Circle) circleMap.get(color);
        if (circle == null)
        {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
