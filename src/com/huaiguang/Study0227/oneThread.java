package com.huaiguang.Study0227;

public class oneThread {
    public static void main(String[] args) {
        Person p1 = new Person("蔡徐坤");
        p1.run();
        Person p2 = new Person("鹿晗");
        p2.run();
    }
}
