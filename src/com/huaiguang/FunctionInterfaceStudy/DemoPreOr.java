package com.huaiguang.FunctionInterfaceStudy;

import java.util.function.Predicate;

public class DemoPreOr {
    public static boolean method(String str, Predicate<String> pre1, Predicate<String> pre2){
//        return pre1.test(str) || pre2.test(str);
//        return pre1.or(pre2).test(str);
        return pre1.negate().test(str); //取反pre1.test（）的结果
    }

    public static void main(String[] args) {
        System.out.println(method("ahshkd", s -> s.length() > 10, s -> s.contains("a")));
    }
}
