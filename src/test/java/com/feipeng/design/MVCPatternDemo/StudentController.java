package com.feipeng.design.MVCPatternDemo;

/**
 * @Author: 飞蓬
 * @Description:
 * @Date:Create：in 2019/4/10 下午9:22
 */
public class StudentController {


    private Student model;
    private StudentView view ;


    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public Student getModel() {
        return model;
    }

    public void setModel(Student model) {
        this.model = model;
    }

    public void updateView(){
        view.printStudentDetails(model);
    }














}

