package com.thinkgem.jeesite.annotation.Demo2;


import java.lang.annotation.*;

@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Description {

    String desc();
    String author();
    int age() default 18;



}
