package com.hiya.dp.structrue.proxy.dynamic;

import java.lang.reflect.Proxy;

import com.hiya.dp.structrue.proxy.FightGame;
import com.hiya.dp.structrue.proxy.GunGame;
import com.hiya.dp.structrue.proxy.IGame;
import com.hiya.dp.structrue.proxy.MotorGame;

/**
 * ��̬����ͨ�����ڶ�ԭ��ҵ���߼������䡣������ж�������ĳ���࣬�����������е�ĳЩ������Ȼ�����ĳ��ԭ�򣬱����¼��־����ӡ����ִ��ʱ�䣬�����ֲ��ý���Щ�߼�д�����
 * ���ķ����
���Կ��Դ���һ��������ʵ�ֺͶ���������ͬ�ķ�����ͨ���ô����������ʵ����Ȼ����ԭ�����е��ô����෽�������ﵽ���������Ҫҵ���߼���Ŀ�ġ�
����ʵҲ���Ǵ���ģʽ��һ��ʵ�֣�ͨ������ʵ����ķ�װ����ʵ����չ�ԡ�
 * @author zjq
 *
 */
public class DynamicProxyClient
{
    public static void main(String[] args)
    {
        IGame fightGameproxy = (IGame) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{IGame.class}, new DynamicProxyHandler(new FightGame("")));
        fightGameproxy.play();
        
        IGame gunGameproxy = (IGame) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{IGame.class}, new DynamicProxyHandler(new GunGame("")));
        gunGameproxy.play();
        
        IGame motorGameproxy = (IGame) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{IGame.class}, new DynamicProxyHandler(new MotorGame("")));
        motorGameproxy.play();
    }
}
