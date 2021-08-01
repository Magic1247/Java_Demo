package cn.start.TestString;

import java.util.Scanner;

public class TestString08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        char[] charArray = str1.toCharArray();
        int countA = 0;
        int counta = 0;
        int countint = 0;
        int countoth = 0;
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if('A' <= ch && 'Z'<= ch){
                countA++;
            }else if('a' <= ch && 'z' <= charArray[i]){
                counta++;
            }else if(ch >= 0 && ch <= 9){
                countint++;
            }else{
                countoth++;
            }
        }
        System.out.println("大写"+countA);
        System.out.println("小写"+countA);
        System.out.println("数字"+countA);
        System.out.println("其他"+countA);
    }
}
