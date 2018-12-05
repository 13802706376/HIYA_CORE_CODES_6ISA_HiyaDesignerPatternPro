package com.hiya.dp.structrue.adapter;

/**
 * 结构型模式, 在不修改原来两个模块代码的情况下,将两个不兼容的类融合在一起,有点像粘合剂,通过转换使得他们能够协作起来, 符合了开闭原则.将某个类的接口转换成客户端期望的另一个接口表示，目的是消除由于接口不匹配所造成的类的兼容性问题。主要分为三类：类的适配器模式、对象的适配器模式、接口的适配器模式。
    
    类适配器通过继承,是静态的定义方式，当希望将一个类转换成满足另一个新接口的类时，可以使用类的适配器模式，创建一个新类，继承原有的类，实现新的接口即可
    对象适配器通过代理,是动态组合的方式。当希望将一个对象转换成满足另一个新接口的对象时，可以创建一个Wrapper类，持有原类的一个实例，在Wrapper类的方法中，调用实例的方法就行。
    接口配器，当不希望实现一个接口中所有的方法时，可以创建一个抽象类Wrapper，实现所有方法，我们写别的类的时候，继承抽象类即可。
 * @author zjq
 *
 */
public class AdapterClient
{

    public static void main(String[] args)
    {
        //类适配器：通过继承,是静态的定义方式，当希望将一个类转换成满足另一个新接口的类时，可以使用类的适配器模式，创建一个新类，继承原有的类，实现新的接口
        VoltClassAdapter voltClassAdapter = new VoltClassAdapter();
        System.out.println(voltClassAdapter.getVolt110());
        System.out.println(voltClassAdapter.getVolt220());
        
        //对象适配器：通过代理,是动态组合的方式。当希望将一个对象转换成满足另一个新接口的对象时，可以创建一个Wrapper类，持有原类的一个实例，在Wrapper类的方法中，调用实例的方法
        VoltObjectAdapter voltObjectAdapter = new VoltObjectAdapter(new VoltChina());
        System.out.println(voltObjectAdapter.getVolt110());
        System.out.println(voltObjectAdapter.getVolt220());
        
        //接口适配器：当不希望实现一个接口中所有的方法时，可以创建一个抽象类Wrapper，实现所有方法，我们写别的类的时候，继承抽象类即可
        VoltInterfaceTargetAdapter voltInterfaceTargetAdapter = new VoltInterfaceTargetAdapter();
        voltInterfaceTargetAdapter.FTP();
    }
}
