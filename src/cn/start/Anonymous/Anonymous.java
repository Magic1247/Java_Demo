package cn.start.Anonymous;

import java.util.Scanner;

public class Anonymous {
    public static void main(String[] args) {
        scan(new Scanner(System.in));
    }
    public static  void scan(Scanner sc){
        System.out.println("输入汉字：");
        String a = sc.next();
        System.out.println(a);
    }

}
