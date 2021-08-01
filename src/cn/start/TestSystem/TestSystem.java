package cn.start.TestSystem;

import java.util.Arrays;

public class TestSystem {
    public static void main(String[] args) {
//        demo1();
        demo2();

    }

    private static void demo2() {
        int[] a = {1,2,3,4,5,6};
        int[] b = {7,8,9,10,11};
        System.out.println("复制前的数组"+Arrays.toString(b));
        System.arraycopy(a,0,b,0,3);
//        for (int i = 0; i < b.length; i++) {
//            System.out.println(b[i]);
//        }
        System.out.println("复制后的数组"+Arrays.toString(b));
    }

    private static void demo1() {
        long start = System.currentTimeMillis();

        for (int i=0; i<=10000; i++){
            System.out.println(i);
        }
        long end = System.currentTimeMillis();

        System.out.println("共耗时"+(end-start)+"毫秒");

    }
}
