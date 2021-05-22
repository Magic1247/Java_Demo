package com.huaiguang.IOStudy;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class DemoInputStrem {
    public static void main(String[] args) throws IOException {
//        demoRead();                  // 读取单个字节
//        demoRead2();                 // 读取多个字节
        demoRead3();
    }

    private static void demoRead3() throws IOException {
        InputStream fis = new FileInputStream("F:\\basic_code\\Start\\src\\com\\huaiguang\\IOStudy\\a.txt");
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes)) != -1 ){
            System.out.println(new String(bytes,0,len));     // 数组转string，offset表示开始转换的索引，len表示转换的个数
        }
    }

    private static void demoRead2() throws IOException {
        InputStream fis = new FileInputStream("F:\\basic_code\\Start\\src\\com\\huaiguang\\IOStudy\\a.txt");
        byte[] bytes = new byte[1000];
        fis.read(bytes);
        System.out.println(Arrays.toString(bytes));
        String str = new String(bytes);
        System.out.println(str);
    }

    private static void demoRead() throws IOException {
        InputStream fis = new FileInputStream("F:\\basic_code\\Start\\src\\com\\huaiguang\\IOStudy\\a.txt");
        int len = 0;
        while ((len = fis.read() )!= -1){        // read()方法读取完后指针向后移动，必须提前接收
            System.out.println((char)(len));
        }
    }
}

