package com.feipeng.design.Ch08_CompositePattern.ex1;


import com.google.common.collect.Lists;

import java.util.List;

/*****
 * 组合模式用于需要以同样的方式的方式处理一组对象作为单个对象。
 * 组合模式根据树结构组成对象，以表示部分以及整个层次结构。这种类型的设计模式属于结构模式，因为此模式创建了一组对象的树结构。
 *
 * 此模式创建一个包含其自身对象的组的类。 此类提供了修改其相同对象的组的方法。
 * 我们通过以下示例展示组合模式的使用，将演示员工组织的层次结构。
 */


public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.subordinates = Lists.newArrayList();

    }

    public  void add(Employee e){
        subordinates.add(e);
    }

    public  void remove(Employee e){
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates(){
        return  subordinates;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ", subordinates=" + subordinates.toString() +
                '}';
    }


}
