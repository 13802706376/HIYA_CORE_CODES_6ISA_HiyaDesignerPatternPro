package com.hiya.dp.creator.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Resume implements Serializable, Cloneable
{
    private static final long serialVersionUID = 8614140644886700330L;
    private PersonalInfo personalInfo;
    private WorkExperience workExperience;

    public Resume()
    {
        personalInfo = new PersonalInfo();
        workExperience = new WorkExperience();
    }

    // 设置个人信息
    public void setPersonalInfo(String name,String sex, Integer age)
    {
        personalInfo.setName(name);
        personalInfo.setSex(sex);
        personalInfo.setAge(age);
    }

    // 设置工作经历
    public void setWorkExperience(String workDate, String company)
    {
        workExperience.setWorkDate(workDate);
        workExperience.setCompany(company);
    }

    // 显示
    public void display()
    {
        System.out.println(String.format("%s %s %s", personalInfo.getName(), personalInfo.getSex(), personalInfo.getAge()));
        System.out.println(String.format("工作经历：%s %s", workExperience.getWorkDate(), workExperience.getCompany()));
    }

    // 浅复制
    @Override
    public Object clone()
    {
        Object obj = null;
        try
        {
            obj = super.clone();
        } catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return obj;
    }

    // 深复制
    public Object deepClone() throws IOException, ClassNotFoundException
    {
        // 将对象写到流里
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(bo);
        oo.writeObject(this);
        // 从流里读出来
        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi = new ObjectInputStream(bi);
        return (oi.readObject());
    }
}
