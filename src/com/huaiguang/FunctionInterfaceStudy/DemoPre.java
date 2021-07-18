package com.huaiguang.FunctionInterfaceStudy;

import java.util.function.Predicate;

public class DemoPre {
    public static void main(String[] args) {
        System.out.println(check("蔡徐坤",
                (s) -> {
                    if (s.equals("蔡徐坤")) {
                        return true;
                    } else {
                        return false;
                    }
                }
        ));
        System.out.println(check("蔡徐坤", s -> s.length() > 5));
    }
    public static boolean check(String s, Predicate<String> pre){
        return pre.test(s);
    }
}
