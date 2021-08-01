package cn.start.StudyDemo;

public class DemoArrayReturn {
    public static void main(String[] args) {
        int [] resultArray = tobeArray(12, 23, 25,25,25,46,78,99,89,89,89,89,89);
        System.out.println("该数组的长度是："+resultArray.length);
        for (int i = 0; i < resultArray.length; i++) {
            System.out.println(resultArray[i]);

        }
    }
    public static int[] tobeArray(int a,int b,int c){
        int[] array = {a,b,c};
        return array;
    }
    public static  int[] tobeArray(int a,int b,int c,int d){
        int[] array = {a,b,c,d,};
        return array;
    }
    public static int[] tobeArray(int...more ){

        return more;
    }
}