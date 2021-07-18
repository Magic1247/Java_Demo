package com.huaiguang.FunctionInterfaceStudy;

import java.util.function.Consumer;

public class DemoConAndThen {
    public static void method(String s, Consumer<String> con1,Consumer<String> con2){
//        con1.accept(s);
//        con2.accept(s);
        con1.andThen(con2).accept(s); // 同一个入参先后由con1及con2的accept()消费，andThen方法可以连接多个Consumer接口
    }

    public static void main(String[] args) {
        method("Hello",
                (t)->{
                    System.out.println(t.toUpperCase());
                },
                (t)->{
                    System.out.println(t.toLowerCase());
                }
        );
    }
}
