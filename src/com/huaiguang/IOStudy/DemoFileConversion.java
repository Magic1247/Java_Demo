package com.huaiguang.IOStudy;

import java.io.*;

public class DemoFileConversion {
    public static void main(String[] args) throws IOException {
        demo01();
    }

    private static void demo01() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("Start\\src\\com\\huaiguang\\IOStudy\\a.txt"),"gbk");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("Start\\src\\com\\huaiguang\\IOStudy\\d.txt"),"UTF-8");
        int len = 0;
        while ((len = isr.read()) != -1){
            System.out.println((char)len);
            osw.write(len);
        }
        isr.close();
        osw.close();
    }
}
