package cn.zyh.StudyDome;

public class Sum {
    public static void main(String[] args) {
        System.out.println(sum2(1,2,3));
        int a = sum2(10,20,30);
        System.out.println(a);
    }
    public static int sum2(int a,int b, int c){
        int result = a+b+c;
        return result;
    }
}
