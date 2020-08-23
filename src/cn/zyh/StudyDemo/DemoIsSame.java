package cn.zyh.StudyDemo;

public class DemoIsSame {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 10;
        long c = 10;
        long d = 10;
        System.out.println(same(c, d));
    }

    public static boolean same(byte a, byte b) {
        System.out.println("这是判断Byte类型的方法！");
        return a == b;
    }

    public static boolean same(short a, short b) {
        System.out.println("这是判断short类型的方法！");
        return a == b;
    }

    public static boolean same(int a, int b) {
        System.out.println("这是判断int类型的方法！");
        return a == b;
    }

    public static boolean same(long a, long b) {
        System.out.println("这是判断long类型的方法！");
        return a == b;
    }

}
