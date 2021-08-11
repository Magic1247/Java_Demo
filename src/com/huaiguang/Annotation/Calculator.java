package com.huaiguang.Annotation;

public class Calculator {
    @Check
    public void add() {
        System.out.println(1 / 0);
    }
}
