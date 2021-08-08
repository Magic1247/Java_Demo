package com.huaiguang.Reflect;

import java.lang.reflect.Constructor;

public class ReflectGetcConstructor {
    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;
        Constructor constructor = personClass.getConstructor();
        Object o = constructor.newInstance();
        Object o1 = personClass.newInstance();  // 使用Class类自带的方法获取空参构造器并创建对象
        System.out.println(o);
        Constructor constructor1 = personClass.getConstructor(String.class, int.class,String.class);  // 获取有参数的构造方法
        System.out.println(constructor1.newInstance("蔡徐坤", 18,"test"));  // 使用反射获得的修饰器创建对象

    }
}
