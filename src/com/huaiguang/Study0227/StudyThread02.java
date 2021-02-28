package com.huaiguang.Study0227;

public class StudyThread02 extends Object implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Runnable线程");
        }
    }
}
