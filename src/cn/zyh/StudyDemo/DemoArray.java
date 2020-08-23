package cn.zyh.StudyDemo;

public class DemoArray {
    public static void main(String[] args) {
        int[] a = new int[300];    // 动态初始化数组 表示创建一个可以存放300个int值的数据
        double[] b = new double[10]; // 动态初始化数组 表示创建一个可以存放10个double值的数据
        int[] c = new int[]{5,15,25}; //静态初始化数组，表示创建一个数据中的元素值分别分5,15,25
        int[] d = {100,200,300,400,500,600};//静态初始化数组的省略写法
//        System.out.println("数组C中的第2号元素值是："+c[2]);
//        System.out.println("数组D中的第2号元素与数组C中的第2号元素和是："+(d[2]+c[2]));
//        System.out.println("================================================");
//        a[2] = 123;
//        b[2] = 3.14;
//        System.out.println(a[0]);
//        System.out.println(a[1]);
//        System.out.println(a[2]);
//        System.out.println("================================================");
//        System.out.println(b[0]);
//        System.out.println(b[1]);
//        System.out.println(b[2]);
        System.out.println(a.length);
        for (int i = 0; i < d.length ; i++) {   //遍历输出数组中所有数据
            System.out.println(d[i]);
        }
    }

}
