package com.huaiguang.ThreadStudy;

public class Chihuo extends Thread{
    private Baozi bz;
    public Chihuo(Baozi bz) {
        this.bz = bz;
    }
    @Override
    public void run() {
        while (true){
            synchronized (bz){
                if (bz.isFlag()==false){
                    bz.notify();
                }else{
                    System.out.println("吃货正在吃"+bz.getPi()+bz.getXian()+"的包子");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    bz.setFlag(false);
                    bz.notify();
                }
            }

        }
    }
}
