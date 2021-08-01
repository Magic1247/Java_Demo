package cn.start.Anonymous;

import java.util.Scanner;

public class Anonymous02 {
    public static void main(String[] args) {
        System.out.println("输入汉字：");
        String a = sc().next();
        System.out.println(a);
    }
    public static Scanner sc(){
        return new Scanner(System.in);
    }
}
