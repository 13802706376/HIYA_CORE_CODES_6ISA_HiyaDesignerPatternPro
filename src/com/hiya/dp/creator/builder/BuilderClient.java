package com.hiya.dp.creator.builder;

/**
 * ������ģʽ���ǽ�һ�����ӵĶ���Ĺ��������ı�ʾ���룬ʹ��ͬ���Ĺ������̿��Դ�����ͬ�ı�ʾ��
������ģʽ�ṩ���Ǵ����������ģʽ����������ģʽ���ǽ����ֲ�Ʒ�����������й��������������϶�����ν���϶������ָĳ������в�ͬ�����ԣ���ʵ������ģʽ����ǰ����󹤳�ģʽ������Test��������õ��ġ�
    Ӧ��ʵ����
    1��̨ʽ�����ʼǱ���ƽ������й�������������������������������ߵĲ���������� 
    2��JAVA �е� StringBuilder��
    ʹ�ó����� 
    1����Ҫ���ɵĶ�����и��ӵ��ڲ��ṹ�� 
    2����Ҫ���ɵĶ����ڲ����Ա����໥������
    �빤��ģʽ�������ǣ�������ģʽ���ӹ�ע�����װ���˳��
 * @author zjq
 *
 */
public class BuilderClient
{
    public static void main(String[] args)
    {
        ComputerDirector pd = new ComputerDirector();  
        Computer padComputer = pd.constructComputer(new PadComputerBuilder());  
        System.out.println(padComputer.getHostMachine());  
        System.out.println(padComputer.getIoDevice());  
        System.out.println(padComputer.getConnLine());  
        
        Computer tableComputer  = pd.constructComputer(new TableComputerBuilder());  
        System.out.println(tableComputer.getHostMachine());  
        System.out.println(tableComputer.getIoDevice());  
        System.out.println(tableComputer.getConnLine()); 
        
        Computer bookComputer  = pd.constructComputer(new BookComputerBuilder());  
        System.out.println(bookComputer.getHostMachine());  
        System.out.println(bookComputer.getIoDevice());  
        System.out.println(bookComputer.getConnLine()); 
    }
}
