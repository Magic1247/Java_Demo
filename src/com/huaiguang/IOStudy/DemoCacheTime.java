package com.huaiguang.IOStudy;

import java.io.*;

public class DemoCacheTime {
    public static void main(String[] args) throws IOException {
        copy2("Start\\src\\com\\huaiguang\\IOStudy\\testpic.png","Start\\src\\com\\huaiguang\\IOStudy\\testpic4.png");
    }
    private static void copy2(String sFile,String eFile) throws IOException {
        long s = System.currentTimeMillis();
        InputStream fis = new FileInputStream(sFile);
        BufferedInputStream bis = new BufferedInputStream(fis);
        OutputStream fos = new FileOutputStream(eFile);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bis.read(bytes)) != -1){
//            System.out.println(len);
            bos.write(bytes,0,len);
        }
//        System.out.println(new String(bytes,0,len));
        System.out.println("Succeeded Copy");
        fis.close();
        fos.close();
        System.out.println(System.currentTimeMillis() - s);
    }
}
