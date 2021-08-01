package cn.start.TestArraylist;

import java.util.ArrayList;
import java.util.Random;

public class TestArraylist08 {
    public static void main(String[] args) {
        ArrayList<Integer> big = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            big.add(r.nextInt(10)+1);
        }
        System.out.println(big.size());
        System.out.println("这个集合中有这些数字:");
        for (int i = 0; i < big.size(); i++) {
            if (i == big.size()-1){
                System.out.println(big.get(i));
            }else{
                System.out.print(big.get(i)+",");
            }
        }
        System.out.println("该集合中的偶数有：");
        for (int i = 0; i < Isoushu(big).size(); i++) {
            System.out.print(Isoushu(big).get(i)+",");
        }
    }
    public static ArrayList<Integer> Isoushu(ArrayList<Integer> list){
        ArrayList<Integer> small = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%2 == 0){
                small.add(list.get(i));
            }
        }
        return small;

    }
}
