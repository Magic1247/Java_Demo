package com.huaiguang.Study0227;

public class StartTicket {
    public static void main(String[] args) {
        Runnableimpl r = new Runnableimpl();
        Thread t0 = new Thread(r);
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);
        t0.start();
        t1.start();
        t2.start();
        t3.start();
    }
}
