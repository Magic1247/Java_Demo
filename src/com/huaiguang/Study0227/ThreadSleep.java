package com.huaiguang.Study0227;

public class ThreadSleep {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i < 60; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}
