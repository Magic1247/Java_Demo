package cn.zyh.StudyDemo;

public class DemoSame {
    public static void main(String[] args) {
        if (method(1, 10)) {
            System.out.println("A与B相同");
        } else {
            System.out.println("A与B不相同");
        }
    }

    public static boolean method(int a, int b) {
        int y;
        if (a == b) {
            return true;
        } else {
            return false;
        }

    }
}
