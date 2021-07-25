package com.huaiguang.FunctionInterfaceStudy;

public class DemoFunPr {
    public static void main(String[] args) {
        demo(s -> System.out.println(s));
        demo(s -> {
            UpperPr up = new UpperPr();
            up.pr(s);
        });
        UpperPr up2 = new UpperPr();
        demo(up2 :: pr);
    }

    private static void demo(FunPrint f) {
        f.funpr("HelloWorld");
    }
}
