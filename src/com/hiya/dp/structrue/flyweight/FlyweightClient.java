package com.hiya.dp.structrue.flyweight;

/**
 * 享元模式（Flyweight Pattern）主要用于减少创建对象的数量，以减少内存占用和提高性能。这种类型的设计模式属于结构型模式，它提供了减少对象数量从而改善应用所需的对象结构的方式。
        享元模式尝试重用现有的同类对象，如果未找到匹配的对象，则创建新对象。我们将通过创建 5 个对象来画出 20 个分布于不同位置的圆来演示这种模式。由于只有 5 种可用的颜色，所以 color 属性被用来检查现有的 Circle 对象。
        何时使用： 1、系统中有大量对象。 2、这些对象消耗大量内存。 3、这些对象的状态大部分可以外部化。 4、这些对象可以按照内蕴状态分为很多组，当把外蕴对象从对象中剔除出来时，每一组对象都可以用一个对象来代替。 5、系统不依赖于这些对象身份，这些对象是不可分辨的。
        如何解决：用唯一标识码判断，如果在内存中有，则返回这个唯一标识码所标识的对象。
        关键代码：用 HashMap 存储这些对象。
        应用实例： 1、JAVA 中的 String，如果有则返回，如果没有则创建一个字符串保存在字符串缓存池里面。 2、数据库的数据池。3、int和Integer 
        优点：大大减少对象的创建，降低系统的内存，使效率提高。
        缺点：提高了系统的复杂度，需要分离出外部状态和内部状态，而且外部状态具有固有化的性质，不应该随着内部状态的变化而变化，否则会造成系统的混乱。
 * @author zjq
 *
 */
public class FlyweightClient
{
    private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };
    public static void main(String[] args)
    {
        for (int i = 0; i < 20; ++i)
        {
            Circle circle = (Circle) CircleFlyweightFactory.getCircle(getRandomColor());
            circle.setX(getRandom());
            circle.setY(getRandom());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor()
    {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandom()
    {
        return (int) (Math.random() * 100);
    }
}
