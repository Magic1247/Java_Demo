package com.huaiguang.StreamStudy;

import java.util.ArrayList;

public class DemoList {
    public static void main(String[] args) {
//        demo01();
        demo02();
    }

    private static void demo02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("张无忌1");
        list.add("张无忌2");
        list.add("张无忌3");
        list.add("无忌");
        list.stream()
                .filter(name->name.startsWith("张"))
                .filter(name->name.length()==3)
                .forEach(name-> System.out.println(name));
    }

    private static void demo01() {
        ArrayList<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("张无忌1");
        list.add("张无忌2");
        list.add("张无忌3");
        list.add("无忌");
        System.out.println(list);
        ArrayList<String> ZhangList = new ArrayList<>();
        for (String s : list){
            if(s.startsWith("张")){
                ZhangList.add(s);
            }
        }
        System.out.println(ZhangList);
        ArrayList<String> tlist = new ArrayList<>();
        for (String s : ZhangList){
            if(s.length() == 3){
                tlist.add(s);
            }
        }
        System.out.println(tlist);
    }
}
