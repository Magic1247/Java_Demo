package cn.start.Study1113;

import java.util.LinkedList;

public class Demo0 {
    public static void main(String[] args) {
       // addTest();
        removeTest();
    }

    private static void addTest() {
        LinkedList<String> list = new LinkedList<>(); // 链表结构，查询慢，增删快，包含大量操作首尾的方法
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        System.out.println(list);
        list.pop();
        System.out.println(list);
        list.addFirst("www");
        System.out.println(list);
        list.push("www");  // 往集合首位增加元素。等同于addFirst()
        System.out.println(list);
        list.addLast("com");  //往集合末尾增加元素，等同于add()
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.clear();
        System.out.println(list);
        System.out.println(list.isEmpty());
    }

    private static void removeTest() {
        LinkedList<String> list = new LinkedList<>(); // 链表结构，查询慢，增删快，包含大量操作首尾的方法
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        System.out.println(list);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
    }
}
