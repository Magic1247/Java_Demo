package cn.zyh.StudyDemo;

public class DemoPrint {
    public static void main(String[] args) {
        byte a = 10;
        myprint(a);
        myprint((int) a);
        myprint((short) a);
        myprint((10l));
        myprint(a == a);
        myprint('中');
        myprint(3.14);
        myprint(3.14F);
        myprint("方法重载");
    }

    public static void myprint(byte a) {


        System.out.println(a);
    }

    public static void myprint(short a) {
        System.out.println(a);
    }

    public static void myprint(int a) {
        System.out.println(a);
    }

    public static void myprint(long a) {
        System.out.println(a);
    }

    public static void myprint(boolean a) {
        System.out.println(a);
    }

    public static void myprint(char a) {
        System.out.println(a);
    }

    public static void myprint(double a) {
        System.out.println(a);
    }

    public static void myprint(float a) {
        System.out.println(a);
    }

    public static void myprint(String a) {
        System.out.println(a);
    }
}
