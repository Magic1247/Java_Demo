package com.huaiguang.Study0227;

public class Runnableimpl implements Runnable{
    private int ticket = 100;
    Object o = new Object();
    @Override
    public void run() {
        while (true){
            synchronized (o){
                if(ticket > 0){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+ "正在卖第" +ticket + "张票");
                    ticket--;

            }
            }
        }
    }
}
