package com.huaiguang.IOStudy;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class DemoIO {
    public static void main(String[] args) throws IOException {
        write01();
    }

    private static void write01() throws IOException {
        OutputStream os = new FileOutputStream("F:\\basic_code\\Start\\src\\com\\huaiguang\\IOStudy\\a.txt");
        os.write(84903859);
        os.close();
    } // 字节流06
}
