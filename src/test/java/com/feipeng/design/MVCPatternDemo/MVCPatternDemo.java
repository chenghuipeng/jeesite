package com.feipeng.design.MVCPatternDemo;

/**
 * @Author: 飞蓬
 * @Description:
 * @Date:Create：in 2019/4/10 下午9:20
 */
public class MVCPatternDemo {




    private static Student retriveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }

    public static void main(String[] args) {

        Student model= retriveStudentFromDatabase();
        StudentView  view = new StudentView();
        StudentController  studentController = new StudentController(model,view);

        studentController.updateView();


        model.setName("john-------->>>>");
        studentController.setModel(model);

        studentController.updateView();






    }







}
