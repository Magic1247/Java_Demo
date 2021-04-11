package com.huaiguang.ThreadStudy;

public class Baozipu extends Thread{
    private Baozi bz;
    private int count;

    public Baozipu(Baozi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true){
            synchronized (bz){
                if (bz.isFlag()==true){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    if(count%2==0){
                        bz.setFlag(true);
                        bz.setPi("薄皮");
                        bz.setXian("牛肉馅");
                        System.out.println("包子铺正在生产"+bz.getPi()+bz.getXian()+"的包子");
                        count++;
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else{
                        bz.setFlag(true);
                        bz.setPi("冰皮");
                        bz.setXian("猪肉馅馅");
                        System.out.println("包子铺正在生产"+bz.getPi()+bz.getXian()+"的包子");
                        count++;
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("包子铺生产完毕");
                    bz.notify();
                }
            }
        }
    }
}
