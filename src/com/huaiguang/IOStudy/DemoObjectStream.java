package com.huaiguang.IOStudy;

import java.io.*;

public class DemoObjectStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        demo01();
        demo02();
    }

    private static void demo02() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Start\\src\\com\\huaiguang\\IOStudy\\person.txt"));
        Object o = ois.readObject();
        Person p = (Person) o;
        System.out.println(p.toString());
    }

    private static void demo01() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Start\\src\\com\\huaiguang\\IOStudy\\person.txt"));
        oos.writeObject(new Person("蔡徐坤",18,110));
    }
}
