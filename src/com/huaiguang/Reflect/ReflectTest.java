package com.huaiguang.Reflect;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReflectTest {
    public static void main(String[] args) throws Exception {
        Properties pro = new Properties();
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        pro.load(is);
        String className = pro.getProperty("className");
        String method = pro.getProperty("methodName");
        Class cls = Class.forName(className);
        Object o = cls.newInstance();
        cls.getMethod(method).invoke(o);
    }
}
