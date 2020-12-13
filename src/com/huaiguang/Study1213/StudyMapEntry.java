package com.huaiguang.Study1213;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudyMapEntry {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"abc");
        map.put(2,"abc");
        map.put(4,"abc");
        map.put(3,"abc");

        System.out.print(map);
        Set<Map.Entry<Integer, String>> mape = map.entrySet();
        for (Map.Entry<Integer, String> entry: mape ) {
            System.out.println(entry.getKey()+entry.getValue());
        }
    }
}
