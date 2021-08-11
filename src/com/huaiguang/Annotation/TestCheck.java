package com.huaiguang.Annotation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

public class TestCheck {
    public static void main(String[] args) throws IOException {
        Calculator c = new Calculator();
        Class<? extends Calculator> aClass = c.getClass();
        Method[] methods = aClass.getMethods();
        BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txt"));
        int num = 0; // 出现异常的次数
        for (Method method : methods) {
            if (method.isAnnotationPresent(Check.class)) {
                try {
                    method.invoke(c);
                } catch (Exception e) {
                    num++;
                    bw.write(method.getName() + "方法出现异常");
                    bw.newLine();
                    bw.write("异常名称：" + e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常原因：" + e.getCause().getMessage());
                    bw.newLine();
                    bw.write("==================================");
                    bw.flush();
                }
            }
        }
        bw.newLine();
        bw.write("本次测试共出现" + num + "次异常");
        bw.close();
    }
}
