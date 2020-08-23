package cn.zyh.StudyDemo;

import java.util.Arrays;

public class PrintArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
//        System.out.print('[');
//        for (int i = 0; i < array.length; i++) {
//            if (i == array.length - 1) {
//                System.out.println(array[i] + "]");
//            } else {
//                System.out.print(array[i] + ",");
//            }
//        }
        System.out.println(Arrays.toString(array));
    }
    public static void left(){
        System.out.println("[");
    }
    public static void douhao(){
        System.out.println(",");
    }
    public static void parray(int[] a){
        for (int i = 0; i < a.length; i++) {

        }
    }
}





