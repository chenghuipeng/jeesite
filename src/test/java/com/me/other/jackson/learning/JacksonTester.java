package com.me.other.jackson.learning;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonTester {

    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = "{\"name\":\"Mahesh\", \"age\":21}";

        //map json to student
        try {
            Student student = mapper.readValue(jsonString, Student.class);
            System.out.println("-----------obj-----------");
            System.out.println(student);

            //mapper.enable(MapperFeature.USE_STD_BEAN_NAMING);
            String jsonStr = mapper.writeValueAsString(student);
            System.out.println("--------jsonStr----------");
            System.out.println(jsonStr);

        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}

class Student {
    private String name;
    private int    age;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}