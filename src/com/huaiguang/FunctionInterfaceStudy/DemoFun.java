package com.huaiguang.FunctionInterfaceStudy;

import java.util.function.Function;

public class DemoFun {
    public static void change(String str, Function<String,Integer> fun){
        System.out.println(fun.apply(str));
    }

    public static void main(String[] args) {
        change("123456",s -> Integer.parseInt(s));
    }
}
