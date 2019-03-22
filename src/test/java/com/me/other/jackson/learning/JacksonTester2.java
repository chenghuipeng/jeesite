package com.me.other.jackson.learning;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonTester2 {

    public static void main(String[] args) {
        JacksonTester2 tester = new JacksonTester2();
        //map json to student
        try {

            Student student = new Student();
            student.setAge(10);
            student.setName("HAAHHAHAA");
            tester.writeJSON(student);

            Student student2 = tester.readJSON();
            System.out.println(student2);

        } catch (Exception e) {
        }
    }

    private void writeJSON(Student student) throws JsonGenerationException, JsonMappingException,
                                            IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File("student.json"), student);
    }

    private Student readJSON() throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        Student student = mapper.readValue(new File("student.json"), Student.class);
        return student;
    }

}
