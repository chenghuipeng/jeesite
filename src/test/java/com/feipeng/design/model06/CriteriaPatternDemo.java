package com.feipeng.design.model06;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

public class CriteriaPatternDemo {

    /********
     *
     *
     * 过滤器模式或条件模式是一种设计模式，使开发人员可以使用不同的条件过滤一组对象，
     * 并通过逻辑操作以解耦方式将其链接。
     * 这种类型的设计模式属于结构模式，因为该模式组合多个标准以获得单个标准。
     *
     */


    @Test
    public void name() {
        List<Person> persons = Lists.newArrayList();
        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males: ");
        printPersons(male.meetCriteria(persons));

        System.out.println("\nFemales: ");
        printPersons(female.meetCriteria(persons));

        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("\nSingle Or Females: ");
        printPersons(singleOrFemale.meetCriteria(persons));

    }

    public static void printPersons(List<Person> persons) {

        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName() + ", Gender : " + person.getGender() + ", Marital Status : " + person.getMaritalStatus() + " ]");
        }


    }

}
