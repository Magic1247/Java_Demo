package cn.zyh.TestRandom;

import java.util.Random;
import java.util.Scanner;

public class TestRandom {
    public static void main(String[] args) {
        Random r = new Random();
        for (int a = 1; a<10; a++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入6以内数字抽奖：");
            System.out.println("=================");
            System.out.println("输入quit以退出程序");
            int sq = sc.nextInt();
            int i = r.nextInt(10);  //括号中有参数左闭右开区间

            System.out.println("本次中奖号码为："+i);
            if(sq==i){
                System.out.println("恭喜您中奖了！！！");
            }else{
                System.out.println("谢谢惠顾！");
            }
        }


    }
}
