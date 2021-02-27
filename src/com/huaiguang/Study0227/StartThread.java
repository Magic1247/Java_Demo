package com.huaiguang.Study0227;

public class StartThread extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 20; i++) {
            System.out.println("一边听歌"+i);
        }
    }

    public static void main(String[] args) {
        MyThread s = new MyThread("蔡徐坤");
//        s.setName("小强");
        s.start();
        new MyThread("鹿晗").start();
//        s.run();
//        for (int i = 0; i < 20 ; i++) {
//            System.out.println("main" + i);
//        }
//        Thread t = Thread.currentThread();
//        System.out.println(t);

    }
}
