package com.huaiguang.ThreadStudy;

public class DemoMain {
    public static void main(String[] args) {
        System.out.println(jc(5));
    }

    private static int jc(int n) {
        if(n==1){
            return 1;
        }
        return n+  jc(n-1);
    }
}
