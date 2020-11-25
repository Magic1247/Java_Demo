package cn.zyh.Study1113;

import java.util.ArrayList;
import java.util.List;

public class Demo01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        System.out.println(list);
        list.add(3,"第四个元素");
        System.out.println(list);
        System.out.println(list.remove(5));
        System.out.println("被替换前"+list);
        list.set(0,"替换元素");
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("=======================");
        for (String s : list
             ) {
            System.out.println(s);
        }
        /*
        * System.out.println(list.get(1111)); // 索引越界异常IndexOutOfBoundsException
        * */

    }
}
