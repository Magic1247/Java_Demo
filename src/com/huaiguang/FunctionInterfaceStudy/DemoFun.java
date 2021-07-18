package com.huaiguang.FunctionInterfaceStudy;


import java.util.function.Function;

public class DemoFun {
    public static void change(String str, Function<String,Integer> fun){
        System.out.println(fun.apply(str));
    }
    public static void changeAndThen(String str, Function<String,Integer> fun1, Function<Integer, String> fun2){
        System.out.println(fun1.andThen(fun2).apply(str));
    }

    public static void main(String[] args) {
//        change("123456",s -> Integer.parseInt(s));
        changeAndThen("100",
                s -> Integer.parseInt(s),
                s -> {
                    s+=10;
                    return s.toString();}
                );
    }

}
