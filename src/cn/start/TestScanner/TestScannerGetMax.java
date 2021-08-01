package cn.start.TestScanner;

import java.util.Scanner;

public class TestScannerGetMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字:");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字:");
        int b = sc.nextInt();
        System.out.println("请输入第三个数字:");
        int c = sc.nextInt();
//        int max = 0;
//        int finalmax;
//        if(a>b){
//            max=a;
//        }else if(b>a){
//            max=b;
//        }else if(b==a){
//            max=b;
//        }
//        if(max>c){
//            System.out.println("最大值为："+max);
//        }else if(max<c){
//            finalmax=c;
//            System.out.println("最大值为："+finalmax);
//        }else  if(max==c){
//            System.out.println("最大值为"+max);
//        }
            int temp = a > b ? a : b;
            int max  = temp > c ? temp : c;
            System.out.println("最大值是："+max);

    }
}
