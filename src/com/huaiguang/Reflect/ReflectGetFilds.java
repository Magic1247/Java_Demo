package com.huaiguang.Reflect;

import java.lang.reflect.Field;

public class ReflectGetFilds {
    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;

        Field[] fields = personClass.getFields(); // 只能获取public修饰的成员变量
        for (Field field : fields) {
            System.out.println(field);
        }
        Field a = personClass.getField("a");  // 获取指定变量
        System.out.println(a);
        Person p = new Person();
        Object o = a.get(p);   // 获取对象对应的成员变狼
        System.out.println(o);
        a.set(p,"test");       // 设置对应对象成员变量
        System.out.println(p);
        System.out.println("===========================");
        Field[] declaredFields = personClass.getDeclaredFields();  // 忽略权限访问所有成员变量
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        Field name = personClass.getDeclaredField("name");
        name.setAccessible(true); // 暴力反射，忽略权限设置成员变量
        name.set(p,"蔡徐坤");
        System.out.println(name.get(p));

    }
}
