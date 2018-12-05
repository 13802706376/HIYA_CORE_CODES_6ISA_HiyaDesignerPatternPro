package com.hiya.dp.creator.prototype;

import java.io.Serializable;

/**
 * ����������
 *
 */
public class WorkExperience implements Serializable
{
    private static final long serialVersionUID = -5461562344310808271L;
    private String workDate;
    private String company;

    public String getWorkDate()
    {
        return workDate;
    }

    public void setWorkDate(String workDate)
    {
        this.workDate = workDate;
    }

    public String getCompany()
    {
        return company;
    }

    public void setCompany(String company)
    {
        this.company = company;
    }
}