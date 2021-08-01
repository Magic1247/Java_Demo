package cn.start.StudyDemo;

public class Demopra {
    public static void main(String[] args) {
        System.out.println(xiangCheng(3, 5));
        helloworld();
    }

    public static int xiangCheng(int a, int b) {

        int result = a * b;
        ;
        return result;
    }

    public static void helloworld() {
        System.out.println("Hello,World!!!");
        System.out.println("Hello,World!!!");
        System.out.println("Hello,World!!!");
        System.out.println("Hello,World!!!");
        System.out.println("Hello,World!!!");
        System.out.println("Hello,World!!!");
        System.out.println("Hello,World!!!");
        System.out.println("Hello,World!!!");
        System.out.println("Hello,World!!!");
        System.out.println("Hello,World!!!");

    }

    public static class DemoA {
        public static void main(String[] args) {
            System.out.println("Hello,World");
        }
    }

    public static class DemoArrayReverse {
        public static void main(String[] args) {
            int[] retest = {10, 20, 30, 40, 46, 464, 97898, 1618, 1649};
            printArray(retest);
            for (int left = 0, right = retest.length - 1; left < right; left++, right--) {
                int temp;
                temp = retest[left];
                retest[left] = retest[right];
                retest[right] = temp;
            }
            printArray(retest);
        }

        public static void printArray(int[] a) {
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            }
        }
    }
}
