package com.huaiguang.FunctionInterfaceStudy;

import java.util.ArrayList;
import java.util.function.Predicate;

/*
过滤name长度为4且age==20的字符串放入新ArrayList
 */
public class FinalDemoPre {
    public static void main(String[] args) {
        String[] arr = {"迪丽热巴,19", "古力娜扎,20", "马儿扎哈,100"};
        ArrayList<String> finalarr = method(arr,
                s -> {
                    String[] split = s.split(",", 0);
                    if (split[0].length() == 4) {
                        return true;
                    } else {
                        return false;
                    }
                },
                s -> {
                    String[] split = s.split(",", 0);
                    if (split[1].equals("20")) {
                        return true;
                    } else {
                        return false;
                    }
                });
        for (String s : finalarr) {
            System.out.println(s);
        }
    }
    public static ArrayList<String> method(String[] s, Predicate<String> pre1, Predicate<String> pre2){
        ArrayList<String> arr = new ArrayList<>();
        for (String s1 : s) {
            if(pre1.and(pre2).test(s1)){
                arr.add(s1);
            }
        }
        return arr;
    }
}
