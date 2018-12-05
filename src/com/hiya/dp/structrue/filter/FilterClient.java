package com.hiya.dp.structrue.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤器模式（Filter Pattern）或标准模式（Criteria Pattern）是一种设计模式，这种模式允许开发人员使用不同的标准来过滤一组对象，
 * 通过逻辑运算以解耦的方式把它们连接起来。
 * 这种类型的设计模式属于结构型模式，它结合多个标准来获得单一标准
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
