package com.hiya.dp.behavior.template;

public abstract class AbstractGame
{
    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    // ģ��
    public final void play()
    {
        // ��ʼ����Ϸ
        initialize();

        // ��ʼ��Ϸ
        startPlay();

        // ������Ϸ
        endPlay();
    }
}
