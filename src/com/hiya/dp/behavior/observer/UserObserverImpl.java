package com.hiya.dp.behavior.observer;

/**
 * �۲���
 * ʵ����update����
 * @author jstao
 */
public class UserObserverImpl implements Observer 
{
    private String name;
    private String message;
    
    public UserObserverImpl(String name) {
        this.name = name;
    }
    
    @Override
    public void update(String message) {
        this.message = message;
        read();
    }
    
    public void read() {
        System.out.println(name + " �յ�������Ϣ�� " + message);
    }
}
