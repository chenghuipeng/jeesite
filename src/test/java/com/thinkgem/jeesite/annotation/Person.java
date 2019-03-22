package com.thinkgem.jeesite.annotation;



@Table("person")
public class Person {



    @Column(value = "id")
    private  Integer id ;

    @Column(value = "name")
    private String name;



    @Column(value = "user_name")
    private String userName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}










