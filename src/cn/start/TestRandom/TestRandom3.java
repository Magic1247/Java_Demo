package cn.start.TestRandom;

import java.util.Random;
import java.util.Scanner;

public class TestRandom3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入随机数范围");
        int n = sc.nextInt();
        Random r = new Random();
        System.out.println(n);
        for (int i = 0; i <10 ; i++) {
            int a = r.nextInt(n)+1;
            System.out.print(a);
        }
    }

}
