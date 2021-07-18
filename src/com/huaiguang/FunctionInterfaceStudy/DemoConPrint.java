package com.huaiguang.FunctionInterfaceStudy;

import java.util.function.Consumer;

public class DemoConPrint {
    public static void main(String[] args) {
        String[] arr = {"迪丽热巴,19","古力娜扎,20","马儿扎哈,100"};
        for (String s : arr) {
            method(s,
                    (t)->{
                        String[] split = t.split(",", 0);
                        System.out.print("姓名:"+split[0]);
                    },
                    (t)->{
                        String[] split = t.split(",", 0);
                        System.out.println("年龄:"+split[1]);
                    });
        }
//        method();
    }
    public static void method(String name,Consumer<String> con1,Consumer<String> con2){
        con1.andThen(con2).accept(name);
    }
}
