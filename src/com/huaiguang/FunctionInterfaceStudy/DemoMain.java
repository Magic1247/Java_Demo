package com.huaiguang.FunctionInterfaceStudy;

public class DemoMain {
    public static void main(String[] args) {
        show(new MyFunctionalInterfaceimpl());
        show(()-> System.out.println("lambda表达式输出"));
        show(new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类输出");
            }
        });
    }

    private static void show(MyFunctionalInterface myinter) {
        myinter.method();
    }
}
