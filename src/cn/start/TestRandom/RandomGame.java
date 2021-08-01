package cn.start.TestRandom;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int a = r.nextInt(100)+1;
        for (int i = 0; i <10 ; i++) {
            System.out.println("请输入竞猜数字：");
            int b = sc.nextInt();
            if(b>a){
                System.out.println("太大了！！！");
            }else if(b<a){
                System.out.println("太小了！！！");
            }else if(b==a){
                System.out.println("恭喜你，猜对了！！！！！！！");
                break;
            }else{
                System.out.println("输入数据非法！！！！！！！！！");
            }
        }
/*
while循环实现
 */
//        while (true){
//            System.out.println("请输入竞猜数字：");
//            int b = sc.nextInt();
//            if(b>a){
//                System.out.println("太大了！！！");
//            }else if(b<a){
//                System.out.println("太小了！！！");
//            }else if(b==a){
//                System.out.println("恭喜你，猜对了！！！！！！！");
//                break;
//            }else{
//                System.out.println("输入数据非法！！！！！！！！！");
//            }
//        }
        System.out.println("=======================");
        System.out.println("游戏结束！");
    }
}
