package com.hiya.dp.structrue.bridge;

/**
 * 桥接（Bridge）是用于把抽象化与实现化解耦，使得二者可以独立变化。这种类型的设计模式属于结构型模式，它通过提供抽象化和实现化之间的桥接结构，来实现二者的解耦。两个维度变化。
使用场景： 
    1、如果一个系统需要在构件的抽象化角色和具体化角色之间增加更多的灵活性，避免在两个层次之间建立静态的继承联系，通过桥接模式可以使它们在抽象层建立一个关联关系。 
    2、对于那些不希望使用继承或因为多层次继承导致系统类的个数急剧增加的系统，桥接模式尤为适用。 
    3、一个类存在两个独立变化的维度，且这两个维度都需要进行扩展。
    注意事项：对于两个独立变化的维度，使用桥接模式再适合不过了。
    当一个维度平等关系用接口（邮件/短信/系统消息），另外一个维度递进后者依赖的用抽象类（普通/紧急/特急）
 * @author zjq
 *
 */
public class BridgeClient
{

    public static void main(String[] args)
    {
        //两个维度，其中抽象类持有接口的对象 ，动态 
        IMessage smsMessage = new SmsMessage(); 
        AbstractMessage abstractMessage = new CommonMessage(smsMessage); 
        abstractMessage.sendMessage("短信普通审批", "陈总"); 
        
        smsMessage = new SmsMessage(); 
        abstractMessage = new UrgencyMessage(smsMessage); 
        abstractMessage.sendMessage("短信加急审批", "陈总"); 
        
        smsMessage = new SmsMessage(); 
        SpecialUrgencyMessage specialUrgencyMessage = new SpecialUrgencyMessage(smsMessage); 
        specialUrgencyMessage.sendMessage("短信特急审批", "陈总"); 
        specialUrgencyMessage.watch("455");
        
        IMessage emailMessage = new EmailMessage(); 
        specialUrgencyMessage = new SpecialUrgencyMessage(emailMessage); 
        specialUrgencyMessage.sendMessage("邮件特急审批", "陈总"); 
        specialUrgencyMessage.watch("455");
    }
}
