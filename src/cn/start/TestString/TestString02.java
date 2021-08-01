package cn.start.TestString;

public class TestString02 {
    public static void main(String[] args) {
        String str1 = "Hello";
        char[] charArray = {'H','e','l','l','o'};
        String str2 =  new String(charArray);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals("Hello"));
        System.out.println(str1.equals("hello"));
//        String str3 = null;
//        System.out.println(str3.equals("Hello"));  // 空指针异常，推荐常量在前
        String strA = "Java";
        String strB = "java";
        System.out.println("大小写java是否相同:"+strA.equals(strB));
        System.out.println("大小写java是否相同:"+strA.equalsIgnoreCase(strB));
    }
//    public boolean Isone(Object obj){    // 忽略大小写进行内容比较
//
//    }
}
