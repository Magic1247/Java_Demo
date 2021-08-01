package cn.start.Study1125;

import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {
    public static void main(String[] args) {
        show01();
    }

    private static void show01() {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"张三");
        map.put(2,"李四");
        map.put(3,"王五");
        map.put(4,"赵六");
        System.out.println(map);
        System.out.println(map.remove(1));
        System.out.println(map);
        System.out.println(map.get(2));
        boolean b1 = map.containsKey(5);
        System.out.println(b1);
        boolean b2 = map.containsKey(2);
        System.out.println(b2);


    }
}
