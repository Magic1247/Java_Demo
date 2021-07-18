package com.huaiguang.FunctionInterfaceStudy;

import java.util.function.Predicate;

public class DemoPreAnd {
    public static boolean method(String str, Predicate<String> pre1, Predicate<String> pre2){
//        return pre1.test(str) && pre2.test(str);
        return pre1.and(pre2).test(str);
    }

    public static void main(String[] args) {
        System.out.println(method("dhshkd", s -> s.length() > 2, s -> s.contains("a")));
    }
}
