package com.hiya.dp.structrue.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterFemale implements IFilter
{
    @Override
    public List<Person> filterPerson(List<Person> persons)
    {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons)
        {
            if (person.getGender().equalsIgnoreCase("FEMALE"))
            {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
