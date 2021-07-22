package com.huaiguang.StreamStudy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoGetStream {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("1","吴亦凡");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        System.out.println(entries);
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
