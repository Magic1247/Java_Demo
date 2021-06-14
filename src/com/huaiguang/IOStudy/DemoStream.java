package com.huaiguang.IOStudy;

import java.io.*;

public class DemoStream {
    public static void main(String[] args) throws IOException {
//        demoWriter();
        demoReader();
    }

    private static void demoReader() throws IOException{
        // 转换流构造方法为字节流 / 字节流+字符集名称
        // 创建转换流，指定字符集为GBK
        InputStreamReader isr = new InputStreamReader(new FileInputStream("Start\\src\\com\\huaiguang\\IOStudy\\a.txt"),"gbk");
        int len = 0;
        while((len = isr.read()) != -1){
            System.out.print((char)len);
        }
    }

    private static void demoWriter() throws IOException {
        // 转换流构造方法为字节流 / 字节流+字符集名称
        // 创建转换流，指定字符集为GBK
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("Start\\src\\com\\huaiguang\\IOStudy\\a.txt"),"GBK");
        osw.write("你好");
        osw.close();
    }
}
