package com.feipeng.design.model06;

import com.google.common.collect.Lists;

import java.util.List;

public class CriteriaSingle implements Criteria {


    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = Lists.newArrayList();
        for (Person person: persons){
            if(person.getMaritalStatus().equalsIgnoreCase("single")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
