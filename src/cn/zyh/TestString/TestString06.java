package cn.zyh.TestString;

public class TestString06 {
    public static void main(String[] args) {
        String a = "aaa,bbb,ccc";
        String[] b = a.split(",");   // 如果需要使用英文句点切分，需要写"//."
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
