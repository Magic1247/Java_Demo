package com.huaiguang.IOStudy;

import java.io.*;
import java.util.ArrayList;

public class DemoObjectList {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        demo01();
        demo02();
    }

    private static void demo02() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Start\\src\\com\\huaiguang\\IOStudy\\PersonList.txt"));
        Object o = ois.readObject();
        ArrayList<Person> list2 = (ArrayList<Person>)o;
        for (Person p : list2) {
            System.out.println(p);
        }
        ois.close();
    }

    private static void demo01() throws IOException {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("蔡徐坤",18,110));
        list.add(new Person("吴亦凡",18,110));
        list.add(new Person("张子枫",18,110));
        list.add(new Person("黄磊",18,110));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Start\\src\\com\\huaiguang\\IOStudy\\PersonList.txt"));
        oos.writeObject(list);
        oos.close();
    }
}
