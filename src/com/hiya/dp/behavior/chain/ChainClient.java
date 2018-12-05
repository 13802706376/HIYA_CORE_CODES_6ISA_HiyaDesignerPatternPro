package com.hiya.dp.behavior.chain;

/**
 * ����˼�壬������ģʽ��Chain of Responsibility Pattern��Ϊ���󴴽���һ�������߶������������ģʽ������������ͣ�������ķ����ߺͽ����߽��н���������͵����ģʽ������Ϊ��ģʽ��
    ������ģʽ�У�ͨ��ÿ�������߶���������һ�������ߵ����á����һ�������ܴ����������ô�������ͬ�����󴫸���һ�������ߣ��������ơ�
    �ؼ����룺Handler ����ۺ����Լ����� HanleRequest ���ж��Ƿ���ʣ����û�ﵽ���������´��ݣ���˭����֮ǰ set ��ȥ��
    Ӧ��ʵ���� activiti����һ�� 
    ʹ�ó����� 1���ж��������Դ���ͬһ�����󣬾����ĸ������������������ʱ���Զ�ȷ���� 2���ڲ���ȷָ�������ߵ�����£����������е�һ���ύһ������ 3���ɶ�ָ̬��һ�����������
    ע������� JAVA WEB �������ܶ�Ӧ�á�
 * @author zjq
 *
 */
public class ChainClient
{
    public static void main(String[] args)
    {
        AbstractLogger loggerChain = ChainFactory.getChainOfLoggers();
        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
    }
}
