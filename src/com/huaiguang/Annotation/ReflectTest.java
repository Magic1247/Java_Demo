package com.huaiguang.Annotation;

import java.io.InputStream;
import java.util.Properties;

@GetRunName(className = "com.huaiguang.Reflect.Person", methodName = "eat")
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        Class<ReflectTest> reflectTestClass = ReflectTest.class;  // 反射当前类
        GetRunName annotation = reflectTestClass.getAnnotation(GetRunName.class);   // 获取当前类注解子类对象
        Class cls = Class.forName(annotation.className());
        Object o = cls.newInstance();
        cls.getMethod(annotation.methodName()).invoke(o);
    }
}
