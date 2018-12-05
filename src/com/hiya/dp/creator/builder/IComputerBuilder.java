package com.hiya.dp.creator.builder;

/**
 * ����һ������ӿڣ��Թ淶��Ʒ����ĸ�����ɳɷֵĽ��졣����ӿڹ涨Ҫʵ�ָ��Ӷ������Щ���ֵĴ����������漰����Ķ��󲿼��Ĵ���
 * @author zjq
 *
 */
public interface IComputerBuilder
{
    void buildHostMachine();
    void buildIoDevice();
    void buildConnLine();
    Computer buildComputer();
}
