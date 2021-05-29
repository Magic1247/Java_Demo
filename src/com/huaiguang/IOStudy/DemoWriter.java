package com.huaiguang.IOStudy;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class DemoWriter {
    static File f = new File("Start\\src\\com\\huaiguang\\IOStudy\\a.txt");

    public static void main(String[] args) throws IOException {
        demo01();
    }

    private static void demo01() throws IOException {
        Writer fw = new FileWriter(f);
        fw.write("test");
        fw.append('A');
        fw.flush();   // 刷新缓冲区，刷新后流依然可用
        fw.close();
//        fw.write(91);
    }
}
