package com.hiya.dp.structrue.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterSingle implements IFilter
{
    @Override
    public List<Person> filterPerson(List<Person> persons)
    {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons)
        {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE"))
            {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
