package cn.zyh.TestArraylist;

import java.util.ArrayList;

public class TestArraylist03 {
    public static void main(String[] args) {
        ArrayList<Integer> ai = new ArrayList<>();
        ai.add(1);
        ai.add(2);
        ai.add(3);
        ai.add(4);
        ai.add(5);
        for (int i = 0; i < ai.size(); i++) {
            System.out.println(ai.get(i));
        }
    }
}
