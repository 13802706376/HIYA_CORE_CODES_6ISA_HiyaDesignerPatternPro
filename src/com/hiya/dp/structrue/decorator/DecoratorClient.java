package com.hiya.dp.structrue.decorator;

/**
 * ���Ƶ�ģʽ�����ط�������ǰ����߼�
    װ��ģʽ���Ǹ�һ����������һЩ�µĹ��ܣ������Ƕ�̬��
    װ����ģʽ��Decorator Pattern��������һ�����еĶ�������µĹ��ܣ�ͬʱ�ֲ��ı���ṹ���������͵����ģʽ���ڽṹ��ģʽ��������Ϊ���е����һ����װ��
    ����ģʽ������һ��װ���࣬������װԭ�е��࣬���ڱ����෽��ǩ�������Ե�ǰ���£��ṩ�˶���Ĺ��ܡ�
    ʹ�ó����� 1����չһ����Ĺ��ܡ� 2����̬���ӹ��ܣ���̬������
    ע������ɴ���̳С�
 * @author zjq
 *
 */
public class DecoratorClient
{

    public static void main(String[] args)
    {
        IGame game = new FightGame();
        
        GameShengdaDecorator gameShengdaDecorator = new GameShengdaDecorator(game);
        gameShengdaDecorator.play();
        
        GameTencentDecorator gameTencentDecorator = new GameTencentDecorator(gameShengdaDecorator);
        gameTencentDecorator.play();
    }

}
