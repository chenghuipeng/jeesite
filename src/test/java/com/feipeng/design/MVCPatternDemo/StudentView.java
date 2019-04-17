package com.feipeng.design.MVCPatternDemo;

/**
 * @Author: 飞蓬
 * @Description:
 * @Date:Create：in 2019/4/10 下午9:22
 */
public class StudentView {


    public void printStudentDetails(Student model) {
        System.out.println("Student:");
        System.out.println("Name::"+model.getName());
        System.out.println("Roll No::"+model.getRollNo());
    }
}
