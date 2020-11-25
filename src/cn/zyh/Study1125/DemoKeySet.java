package cn.zyh.Study1125;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoKeySet {
    public static void main(String[] args) {
        KS();
    }

    private static void KS() {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"张三");
        map.put(2,"李四");
        map.put(3,"王五");
        map.put(4,"赵六");
//        Set<Integer> key = map.keySet();
        for (Integer i : map.keySet()) {
            System.out.println(i+map.get(i));
        }
    }
}
