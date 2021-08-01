package cn.start.TestArrays;

import java.util.Arrays;
import java.util.Scanner;

public class TestArrays02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入随机字符串：");
        String str1 = sc.next();
        char[] charArray = str1.toCharArray();
        Arrays.sort(charArray);
        System.out.println(charArray);
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
    }
}
