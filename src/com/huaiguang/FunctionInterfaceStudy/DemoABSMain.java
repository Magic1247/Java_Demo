package com.huaiguang.FunctionInterfaceStudy;

public class DemoABSMain {
    public static void main(String[] args) {
        demo(-10,Math::abs);
    }

    private static void demo(int i,DemoABS d) {
        System.out.println(d.calabs(i));
    }
}
