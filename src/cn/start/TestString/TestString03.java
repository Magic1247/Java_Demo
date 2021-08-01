package cn.start.TestString;

public class TestString03 {
    public static void main(String[] args) {
        String str1 = "fdoiahfh";
        int length  = "dafikadhfishdihfois".length();
        System.out.println("字符串的长度是"+length);
        System.out.println(str1.length());   //返回字符串长度
        System.out.println(str1.concat("这是拼接的内容")); // 字符串拼接，入参也是字符串
        System.out.println(str1.charAt(2)); // 返回字符串中入参索引值的字符
        System.out.println(str1.indexOf("o")); // 返回入参字符串第一次出现的位置
        System.out.println(str1.indexOf("Test")); // 返回入参字符串第一次出现的位置如果没有出现返回-1值
    }

}
