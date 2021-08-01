package cn.start.TestColl;

import java.util.ArrayList;
import java.util.Collection;

public class TestColl {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("Hello");
        coll.add("World");
        coll.add("Hello2");
        coll.add("java");
//        System.out.println(coll);
//        boolean a = coll.remove("Hello");
//        System.out.println(a);
//        System.out.println(coll);
//        System.out.println(coll.size());
////        coll.clear();
//        System.out.println("集合中是否含有java"+coll.contains("java"));
//        System.out.println(coll.isEmpty());
//        Object[] array = coll.toArray();
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//        Iterator<String> it = coll.iterator(); // 创建一个迭代器接口
//        boolean b = it.hasNext(); //  判断集合中是否还存在元素
//        System.out.println(b);
//        String str1 = it.next(); // 取出集合中的下一个元素
//        System.out.println(str1);
        /*
        * while循环+迭代器遍历集合
        * */
//        while (it.hasNext()){          // 不知道集合中元素数量，使用While循环，使用hasNext（）判断集合中是否还存在元素
//            System.out.println(it.next()); // 输出集合中的下一个元素
//        }
        /*
        * for循环+迭代器遍历集合
        * */
//        for (Iterator<String> it2 = coll.iterator();it2.hasNext();){ // for循环创建迭代器，步进表达式返回布尔类型，hasNest()返回false的时候停止循环，
//            String e = it2.next();
//        }


        for (String s : coll) {
            System.out.println(s);
        }

    }
}
