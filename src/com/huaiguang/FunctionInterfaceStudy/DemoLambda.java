package com.huaiguang.FunctionInterfaceStudy;

public class DemoLambda {
    public static void main(String[] args) {
        StartThread(()->
            System.out.println(Thread.currentThread().getName()+"Lambda线程开启"));
        StartThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"匿名内部类线程开启");
            }
        });
    }
    public static void StartThread(Runnable run){
        new Thread(run).start();
    }
}
