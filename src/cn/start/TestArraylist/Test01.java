package cn.start.TestArraylist;

public class Test01 {
    public static void main(String[] args) {
        TestArraylist01 a = new TestArraylist01("鹿晗",18);
        TestArraylist01 b = new TestArraylist01("蔡徐坤",19);
        TestArraylist01 c = new TestArraylist01("吴亦凡",100);
        TestArraylist01[] array = new TestArraylist01[3];
        array[0] = a;
        array[1] = b;
        array[2] = c;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].getName());
            System.out.println(array[i].getAge());
        }
    }
}
