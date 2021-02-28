package com.huaiguang.Study0227;

public class StartThreadRunnable {
    public static void main(String[] args) {
        for (int i = 0; i < 20 ; i++) {
            System.out.println("mian" + i);
        }
        StudyThread02 s = new StudyThread02();
        new Thread(s).start();
    }
}
