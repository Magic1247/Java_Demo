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
            if (map.containsKey(cA[i])){   // A:判断key是否存在 planB:get方法获取值如果返回null，则证明该字符未添加到map集合中
                Integer count = map.get(cA[i]);
                map.put(cA[i],++count);
            }else{
                map.put(cA[i],1);
            }

        }

        System.out.println(map);
    }
}
