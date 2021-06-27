package com.huaiguang.FunctionInterfaceStudy;

public class DemoLogger {
    public static void main(String[] args) {
        String msg1 = "Hello";
        String msg2 = "World";
        String msg3 = "Java";
        show(1,()->{return msg1+msg2+msg3;});
//        show(2, new LoggerBulider() {
//            @Override
//            public String bulider() {
//                return msg1+msg2+msg3;
//            }
//        });
    }

    private static void show(int level,LoggerBulider lb) {
        if(level == 1){
            System.out.println(lb.bulider());
        }
    }
}
