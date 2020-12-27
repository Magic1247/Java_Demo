package com.huaiguang.Study1227;

import java.util.HashMap;
import java.util.Scanner;


public class StringNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入需要计数的字符串：");
        String str = sc.next();
        char[] cA = str.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < cA.length; i++) {
            if (map.containsKey(cA[i])){
                Integer count = map.get(cA[i]);
                map.put(cA[i],++count);
            }else{
                map.put(cA[i],1);
            }

        }
        System.out.println(map);
    }
}
