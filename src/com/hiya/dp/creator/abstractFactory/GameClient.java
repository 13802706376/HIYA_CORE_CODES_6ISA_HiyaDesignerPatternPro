package com.hiya.dp.creator.abstractFactory;

/**
 * ������ģʽ��һ���ӿڣ�����ʵ���࣬����ӿڹ����࣬��������Բ����Լ���ʵ�����������಻��Ҫ�޸Ĺ����ֻ࣬��Ҫ��չ����ʵ��������๤���༴�ɡ������˿���ԭ��
��������ģʽ��һ��������ǣ���Ĵ������������࣬Ҳ����˵�������Ҫ��չ���򣬱���Թ���������޸ģ���Υ���˱հ�ԭ�����ԣ�����ƽǶȿ��ǣ���һ�������⣬��ν����
���õ����󹤳�ģʽ��������������࣬����һ����Ҫ�����µĹ��ܣ�ֱ�������µĹ�����Ϳ����ˣ�����Ҫ�޸�֮ǰ�Ĵ��롣
 * @author zjq
 *
 */
public class GameClient
{
    public static void main(String[] args)
    {
        //�������಻��Ҫ�޸Ĺ����ֻ࣬��Ҫ��չ����ʵ��������๤���༴�ɣ������˿���ԭ��
        FightGameFactory fightGameFactory = new FightGameFactory();
        GunGameFactory gunGameFactory = new GunGameFactory();
        MotorGameFactory motorGameFactory = new MotorGameFactory();

        // ��ȡ FightGame �Ķ��󣬲��������� play ����
        IGame fightGame = fightGameFactory.getGame();
        fightGame.play();

        // ��ȡ GunGame �Ķ��󣬲��������� play ����
        IGame gunGame = gunGameFactory.getGame();
        gunGame.play();

        // ��ȡ MotorGame �Ķ��󣬲��������� play ����
        IGame motorGame = motorGameFactory.getGame();
        motorGame.play();
    }
}
