package cn.zyh.TestArraylist;

import java.util.ArrayList;

public class TestArraylist02 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        System.out.println(al);
        al.add("鹿晗");
        al.add("蔡徐坤");
        al.add("吴亦凡");
        System.out.println(al);
        System.out.println(al.remove(2));// 删除该集合3号元素，并打印删除的元素内容
        System.out.println(al);// 打印集合中所有元素
        System.out.println(al.get(1)); // 取该集合中第2个元素
        System.out.println(al.size()); // 打印集合长度
        for (int i = 0; i < al.size(); i++) { // 根据集合长度遍历集合所有元素
            System.out.println(al.get(i));
        }
    }
}
