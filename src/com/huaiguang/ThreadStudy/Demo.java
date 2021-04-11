package com.huaiguang.ThreadStudy;

public class Demo {
    public static void main(String[] args) {
        Baozi bz = new Baozi("1","11",false);
        new Chihuo(bz).start();
        new Baozipu(bz).start();

    }
}
