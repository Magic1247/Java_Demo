package cn.zyh.Demoencapsulation;

public class DomeEnc {
    public static void main(String[] args) {
        int[] a = {10,20,30,50,1,60,40,79,7987,74987};
        System.out.println("该数组中最大的值是"+getMax(a));
    }
    public static int getMax(int[] a){
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i]>max){
                max = a[i];
            }
        }
        return max;
    }
}
