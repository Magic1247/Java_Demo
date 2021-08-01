package cn.start.TestArrays;

import java.util.Arrays;

public class TestArrays {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        String a = Arrays.toString(array);
        System.out.println(a);
        Arrays.sort(array);   // sort方法返回值为空，不会返回新数组，直接改变入参数组
        System.out.println(Arrays.toString(array));
    }

}
