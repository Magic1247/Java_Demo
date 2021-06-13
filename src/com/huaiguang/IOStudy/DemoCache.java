package com.huaiguang.IOStudy;

import java.io.*;

public class DemoCache {
    public static void main(String[] args) throws IOException {
//        demobos();
        demobis();
    }

    private static void demobis() throws IOException {
        long s = System.currentTimeMillis();
        InputStream fis = new FileInputStream("Start\\src\\com\\huaiguang\\IOStudy\\a.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes)) != -1){
            String s1 = new String(bytes, 0, len);
            System.out.println(s1);
        }
    }

    private static void demobos() throws IOException {
        long s = System.currentTimeMillis();
        OutputStream fos = new FileOutputStream("Start\\src\\com\\huaiguang\\IOStudy\\a.txt",true);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write("写入缓冲区".getBytes());
        bos.close();
        System.out.println(System.currentTimeMillis() - s);
    }
}
