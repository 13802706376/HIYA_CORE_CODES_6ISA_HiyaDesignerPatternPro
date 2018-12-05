
package com.hiya.dp.creator.prototype;

import java.io.IOException;

/**
 * 在Java中原型模式变成clone()方法的使用，由于Java的纯洁的面向对象特性，使得在Java中使用设计模式变得很自然，两者已经几乎是浑然一体了。
（1）为了获取对象的一份拷贝，我们可以利用Object类的clone()方法。 
（2）在派生类中覆盖基类的clone()方法，并声明为public。 
（3）在派生类的clone()方法中，调用super.clone()。 
（4）在派生类中实现Cloneable接口。

在Java中，clone()方法是浅复制。
浅复制（浅克隆） ：被复制对象的所有变量都含有与原来的对象相同的值，而所有的对其他对象的引用仍然指向原来的对象。换言之，浅复制仅仅复制所考虑的对象，而不复制它所引用的对象。
深复制（深克隆）：被复制对象的所有变量都含有与原来的对象相同的值，除去那些引用其他对象的变量。那些引用其他对象的变量将指向被复制过的新对象，而不再是原有的那些被引用的对象。
换言之，深复制把要复制的对象所引用的对象都复制了一遍。可以利用串行化来做深复制，所谓对象序列化就是将对象的状态转换成字节流，以后可以通过这些值再生成相同状态的对象
 * @author zjq
 *
 */
public class ProtoTypeClient
{
    public static void main(String[] args) throws ClassNotFoundException, IOException
    {
        Resume a = new Resume();
        a.setPersonalInfo("大鸟", "男", 29);
        a.setWorkExperience("1998-2000", "xx公司");
        // 浅复制
        Resume b = (Resume) a.clone();
        b.setWorkExperience("1998-2006", "yy公司");
        b.setPersonalInfo("大鸟2", "男", 25);

        /*
         * 大鸟2 男 25
                工作经历：1998-2006 yy公司
                大鸟2 男 25
                工作经历：1998-2006 yy公司
         */
        a.display();
        b.display();


        Resume c = new Resume();
        c.setPersonalInfo("大鸟3", "男", 29);
        c.setWorkExperience("1998-2000", "xx公司");
        // 深复制
        Resume d = (Resume) c.deepClone();
        d.setWorkExperience("1998-2006", "yy公司");
        d.setPersonalInfo("大鸟4", "男", 25);

        /*
         * 大鸟3 男 29
                工作经历：1998-2000 xx公司
                大鸟4 男 25
                工作经历：1998-2006 yy公司
         */
        c.display();
        d.display();
    }
}