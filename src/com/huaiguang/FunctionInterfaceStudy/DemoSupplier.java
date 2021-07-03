package com.huaiguang.FunctionInterfaceStudy;

import java.util.function.Supplier;

public class DemoSupplier {
    public static void main(String[] args) {
        System.out.println(demo01(
                new Supplier<String>() {
                    @Override
                    public String get() {
                        return "test";
                    }
                }
        ));
        System.out.println(demo01(() -> "test"));
    }

    private static String demo01(Supplier<String> sup) {
        return sup.get();
    }
}
