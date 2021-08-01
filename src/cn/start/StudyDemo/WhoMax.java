package cn.start.StudyDemo;

public class WhoMax {
    public static void main(String[] args) {
        System.out.print(max(50, 60));
    }

    public static int max(int a, int b) {
        int maxone;
        if (a > b) {
            maxone = a;
        } else {
            maxone = b;
        }
        System.out.print("最大的是：");

        return maxone;
    }
}
