package cn.start.TestArraylist;

import java.util.ArrayList;

/*
定义指定格式打印集合的方法（Arraylist类型作为参数），使用{}括起来，元素之间使用@分割
 */
public class TestArraylist06 {
    public static void ArraylistPrint(ArrayList<Integer> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            System.out.print("@");
            if(i == list.size()-1){
                System.out.println("}");
            }
        }
    }

}
