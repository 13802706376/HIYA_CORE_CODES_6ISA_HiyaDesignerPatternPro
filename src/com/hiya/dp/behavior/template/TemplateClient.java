package com.hiya.dp.behavior.template;

/**
 * 在模板模式（Template Pattern）中，一个抽象类公开定义了执行它的方法的方式/模板。它的子类可以按需要重写方法实现，但调用将以抽象类中定义的方式进行。
 * 这种类型的设计模式属于行为型模式。
        意图：定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
        应用实例： 
        1、在造房子的时候，地基、走线、水管都一样，只有在建筑的后期才有加壁橱加栅栏等差异。 
        2、西游记里面菩萨定好的 81 难，这就是一个顶层的逻辑骨架。
        3、spring 中对 Hibernate 的支持，将一些已经定好的方法封装起来，比如开启事务、获取 Session、关闭 Session 等，程序员不重复写那些已经规范好的代码，直接丢一个实体就可以保存。
        优点： 1、封装不变部分，扩展可变部分。 2、提取公共代码，便于维护。 3、行为由父类控制，子类实现。
 * @author zjq
 *
 */
public class TemplateClient
{
    public static void main(String[] args)
    {
        AbstractGame game = new FightGame();
        game.play();
        System.out.println();
        
        game = new GunGame();
        game.play();      
    }
}
