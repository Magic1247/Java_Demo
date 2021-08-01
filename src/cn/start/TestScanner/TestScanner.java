package cn.start.TestScanner;
import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int x = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int y = sc.nextInt();
        if(x>y){
            System.out.println(x+"比"+y+"大");
        }else if(y>x){
            System.out.println(y+"比"+x+"大");
        }else if(x==y){
            System.out.println(y+"="+x);
        }
        String str = sc.next();
        System.out.println(str);
    }
}
