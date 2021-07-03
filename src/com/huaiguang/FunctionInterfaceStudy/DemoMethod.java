package com.huaiguang.FunctionInterfaceStudy;

import java.util.Arrays;
import java.util.Comparator;

public class DemoMethod {
    public static void main(String[] args) {
        String[] arr = {"aaa","bb","cccc"};
        Arrays.sort(arr,demo());
//        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static Comparator<String> demo() {
//        return new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.length()-o1.length();
//            }
//        };
        return ((o1, o2) -> o2.length()-o1.length());

    }
}
