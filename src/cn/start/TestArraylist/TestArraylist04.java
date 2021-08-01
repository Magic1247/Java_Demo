package cn.start.TestArraylist;

import java.util.ArrayList;
import java.util.Random;

public class TestArraylist04 {
    public static void main(String[] args) {
        ArrayList<Integer>  a  = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            int b = r.nextInt(33)+1;
            a.add(b);
        }
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }
}
