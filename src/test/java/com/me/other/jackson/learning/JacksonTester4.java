package com.me.other.jackson.learning;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonTester4 {

    public static void main(String[] args) {

        JacksonTester4 tester = new JacksonTester4();

        //map json to student
        try {

            ObjectMapper mapper = new ObjectMapper();

            Map<String, Object> studentDataMap = new HashMap<String, Object>();

            UserData userData = new UserData();

            int[] marks = {
                1,
                2,
                3
            };

            Student student = new Student();
            student.setAge(10);
            student.setName("Mahesh");
            // JAVA Object
            userData.setStudent(student);
            // JAVA String
            userData.setName("Mahesh Kumar");
            userData.setVerified(Boolean.FALSE);

            userData.setMarks(marks);

            // JAVA Boolean
            studentDataMap.put("userData", userData);
            // Array
            mapper.writeValue(new File("student.json"), studentDataMap);

            studentDataMap = mapper.readValue(new File("student.json"), new TypeReference() {
            });

            System.out.println(studentDataMap.get("userData"));
            System.out.println(studentDataMap.get("userData"));
            System.out.println(studentDataMap.get("userData"));
            System.out.println(studentDataMap.get("userData"));

        } catch (Exception e) {

        }
    }

}

class UserData {
    private Student student;
    private String  name;
    private Boolean verified;
    private int[]   marks;

    public UserData() {
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }
}
