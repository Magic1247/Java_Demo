package cn.zyh.TestString;

public class TestString07 {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        System.out.println(getStringbyArray(a));

    }
    public static String getStringbyArray(int[] array){
        String a = "[";
        for (int i = 0; i < array.length; i++) {
            if(i == array.length-1){
                a += "word"+array[i]+"]";
            }else{
                a += "word"+array[i]+"#";
            }
        }
        return a;
    }
}
