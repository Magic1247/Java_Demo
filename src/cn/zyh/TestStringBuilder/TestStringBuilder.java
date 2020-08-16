package cn.zyh.TestStringBuilder;

import javax.swing.*;
import java.util.Scanner;

public class TestStringBuilder {
    public static void main(String[] args) {
//        demoSB();
        demoInteger();

    }

    private static void demoInteger() {
        Integer i = new Integer(1);
        System.out.println(i);
        String str1 = Integer.toString(100); // 包装类重写的toString方法，将输入的基础类型转化为字符串
        System.out.println(str1+200);
        System.out.println(i+"");   // 任意基础类型+字符串直接转化为字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入true/false：");
        String bl = sc.next();
        boolean b = Boolean.parseBoolean(bl); // 布尔值类型包装类，将字符串解析为布尔值，除Char类型包装类，其他包装类均有此解析方法
        while (b){
            System.out.println("字符串转化为Boolean");
        }
        System.out.println("输入的字符串转化为布尔值False");
    }

    private static void demoSB() {
        StringBuilder bu1 = new StringBuilder();
        System.out.println(bu1);
        System.out.println("bu1:"+bu1);
        StringBuilder aaa = bu1.append("aaa");
        System.out.println(aaa);
        aaa.append(1);
        System.out.println(aaa.append(546464646546454646L).toString().toUpperCase());
        aaa.reverse(); // 反转字符串缓冲区
        System.out.println(aaa);
    }
}
