package com.huaiguang.Study1227;

public class ClassThread {
    public static void main(String[] args) {
        Thread t = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("内部多线程");
                }
            }
        };
        t.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("main线程");
        }


    }
}
