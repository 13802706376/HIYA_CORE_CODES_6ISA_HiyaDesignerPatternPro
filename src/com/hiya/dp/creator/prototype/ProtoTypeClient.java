
package com.hiya.dp.creator.prototype;

import java.io.IOException;

/**
 * ��Java��ԭ��ģʽ���clone()������ʹ�ã�����Java�Ĵ��������������ԣ�ʹ����Java��ʹ�����ģʽ��ú���Ȼ�������Ѿ������ǻ�Ȼһ���ˡ�
��1��Ϊ�˻�ȡ�����һ�ݿ��������ǿ�������Object���clone()������ 
��2�����������и��ǻ����clone()������������Ϊpublic�� 
��3�����������clone()�����У�����super.clone()�� 
��4������������ʵ��Cloneable�ӿڡ�

��Java�У�clone()������ǳ���ơ�
ǳ���ƣ�ǳ��¡�� �������ƶ�������б�����������ԭ���Ķ�����ͬ��ֵ�������еĶ����������������Ȼָ��ԭ���Ķ��󡣻���֮��ǳ���ƽ������������ǵĶ��󣬶��������������õĶ���
��ƣ����¡���������ƶ�������б�����������ԭ���Ķ�����ͬ��ֵ����ȥ��Щ������������ı�������Щ������������ı�����ָ�򱻸��ƹ����¶��󣬶�������ԭ�е���Щ�����õĶ���
����֮����ư�Ҫ���ƵĶ��������õĶ��󶼸�����һ�顣�������ô��л�������ƣ���ν�������л����ǽ������״̬ת�����ֽ������Ժ����ͨ����Щֵ��������ͬ״̬�Ķ���
 * @author zjq
 *
 */
public class ProtoTypeClient
{
    public static void main(String[] args) throws ClassNotFoundException, IOException
    {
        Resume a = new Resume();
        a.setPersonalInfo("����", "��", 29);
        a.setWorkExperience("1998-2000", "xx��˾");
        // ǳ����
        Resume b = (Resume) a.clone();
        b.setWorkExperience("1998-2006", "yy��˾");
        b.setPersonalInfo("����2", "��", 25);

        /*
         * ����2 �� 25
                ����������1998-2006 yy��˾
                ����2 �� 25
                ����������1998-2006 yy��˾
         */
        a.display();
        b.display();


        Resume c = new Resume();
        c.setPersonalInfo("����3", "��", 29);
        c.setWorkExperience("1998-2000", "xx��˾");
        // ���
        Resume d = (Resume) c.deepClone();
        d.setWorkExperience("1998-2006", "yy��˾");
        d.setPersonalInfo("����4", "��", 25);

        /*
         * ����3 �� 29
                ����������1998-2000 xx��˾
                ����4 �� 25
                ����������1998-2006 yy��˾
         */
        c.display();
        d.display();
    }
}