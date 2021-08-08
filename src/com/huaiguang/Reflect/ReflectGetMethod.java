package com.huaiguang.Reflect;

import java.lang.reflect.Method;

public class ReflectGetMethod {
    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        Method eat = personClass.getMethod("eat");
        eat.invoke(new Person());
        System.out.println("======================");
        Method method = personClass.getMethod("eat",String.class);
        method.invoke(new Person(),"饭");
    }

}
