package com.huaiguang.IOStudy;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class DemoReader {
    static File f = new File("Start\\src\\com\\huaiguang\\IOStudy\\a.txt");
    public static void main(String[] args) throws IOException {
        demo02();
    }

    private static void demo01() throws IOException {
        Reader fr = new FileReader(f);
        int len = 0;
        while ((len = fr.read())!= -1){
            System.out.print((char)len);
        }
        fr.close();
    }
    private static void demo02() throws IOException {
        Reader fr = new FileReader(f);
        int len = 0;
        char[] cs = new char[1024];
        while ((len = fr.read(cs))!= -1){
            System.out.print(new String(cs,0,len));  // String构造方法，字符数组，开始索引，有效个数
        }
        fr.close();
    }
}
