package com.huaiguang.FunctionInterfaceStudy;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class DemoGetMax {
    public static void main(String[] args) {
//        int[] arr = {100,1,300};
//        System.out.println(getMax(() -> {
//            int max = arr[0];
//            for (int i : arr) {
//                if (i > max) {
//                    max = i;
//                }
//            }
//            return max;
//        }));
        con("蔡徐坤",(name) -> {
            System.out.println("消费"+name);
        });
    }
    private static void con(String name, Consumer<String> con){
        con.accept(name);
    }

    private static int getMax(Supplier<Integer> integerSupplier) {
        return integerSupplier.get();  // 重点在于get方法重写
    }
}
