package com.huaiguang.IOStudy;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class DemoOutputStrem {
    public static void main(String[] args) throws IOException {
        write01();
    }

    private static void write01() throws IOException {
        OutputStream os = new FileOutputStream("Start\\src\\com\\huaiguang\\IOStudy\\a.txt",false);
//        os.write(84903859);
        byte[] bytes = {65,66,67,68,69};   // 第一个字节为正数查询ACS表，第一个字节为负数，和第二个字节组成一个中文显示
        os.write(bytes);
        os.write(bytes,1,2);  // 从索引1开始写，写两个字节
        String str = "测试";
        byte[] bytes1 = str.getBytes();
        os.write(bytes1);
        for (int i = 0; i < 10; i++) {
            os.write("你好".getBytes());
            os.write("\r\n".getBytes());
        }
        os.close();
    } // 字节流06
}
