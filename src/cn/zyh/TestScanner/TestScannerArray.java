package cn.zyh.TestScanner;

import java.util.Scanner;

public class TestScannerArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入五个数字组成数组");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int [] array = {a,b,c,d,e};
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
        PrintArray pr = new PrintArray();
        pr.print(array);
        new PrintArray().print(array); //匿名对象调用打印数组的方法

    }
}
