package cn.start.TestArraylist;

import java.util.ArrayList;

public class TestArraylist05 {
    public static void main(String[] args) {
        ArrayList<TestArraylist01> list = new ArrayList<>();
        TestArraylist01 t1 = new TestArraylist01();
        t1.setAge(18);
        t1.setName("吴亦凡");
        TestArraylist01 t2 = new TestArraylist01();
        t2.setAge(19);
        t2.setName("鹿晗");
        TestArraylist01 t3 = new TestArraylist01();
        t3.setAge(20);
        t3.setName("蔡徐坤");
        TestArraylist01 t4 = new TestArraylist01();
        t4.setAge(21);
        t4.setName("肖战");
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName());
            System.out.println(list.get(i).getAge());
        }

    }
}
