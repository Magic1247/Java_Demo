package com.huaiguang.FunctionInterfaceStudy;

import java.util.function.Function;

public class FinalDemoFun {
    public static void main(String[] args) {
        String str = "赵丽颖,20";
        change(str,
                s -> s.split(",")[1].toString(),
                s -> Integer.parseInt(s),
                s -> s+=100
                );

    }
    public static void change(String str, Function<String,String> fun1, Function<String,Integer> fun2, Function<Integer,Integer> fun3){
        System.out.println(fun1.andThen(fun2).andThen(fun3).apply(str));
    }
}
