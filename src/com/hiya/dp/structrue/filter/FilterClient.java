package com.hiya.dp.structrue.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * ������ģʽ��Filter Pattern�����׼ģʽ��Criteria Pattern����һ�����ģʽ������ģʽ��������Աʹ�ò�ͬ�ı�׼������һ�����
 * ͨ���߼������Խ���ķ�ʽ����������������
 * �������͵����ģʽ���ڽṹ��ģʽ������϶����׼����õ�һ��׼
 * @author zjq
 *
 */
public class FilterClient
{

    public static void main(String[] args)
    {
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Robert", "Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));

        IFilter male = new FilterMale();
        IFilter female = new FilterFemale();
        IFilter single = new FilterSingle();

        System.out.println("Males: ");
        printPersons(male.filterPerson(persons));

        System.out.println("\nFemales: ");
        printPersons(female.filterPerson(persons));

        System.out.println("\nSingle Males: ");
        printPersons(single.filterPerson(persons));

    }

    public static void printPersons(List<Person> persons)
    {
        for (Person person : persons)
        {
            System.out.println("Person : [ Name : " + person.getName() + ", Gender : " + person.getGender()+ ", Marital Status : " + person.getMaritalStatus() + " ]");
        }
    }
}
