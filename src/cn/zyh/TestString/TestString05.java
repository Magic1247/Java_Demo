package cn.zyh.TestString;

public class TestString05 {
    public static void main(String[] args) {
        String a = "fhasohfiuhs";
        char[] b = a.toCharArray();            // 将自负床转化为char型数组
        System.out.println(b[2]);
        byte[] c = a.getBytes();               // 将字符串转化为底层byte字节数
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
        String d = "HelloWorld!";
        a.replace(a,d);                         // 将旧字符串替换为新字符串并返回新字符串
        System.out.println(d);

    }
}
