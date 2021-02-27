package com.huaiguang.Study0227;

public class MyThread extends Thread{
    public MyThread() {}
    public MyThread(String name){
        super(name);
    }
    @Override
    public void run() {
//        for (int i = 0; i < 20; i++) {
//            System.out.println("mt" + i);
//        }
//        String name = getName();
//        System.out.println(name);
        System.out.println(Thread.currentThread().getName());
    }
}
