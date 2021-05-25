package com.huaiguang.IOStudy;

import java.io.*;

public class DemoCopy {
    public static void main(String[] args) throws IOException{
        copy("Start\\src\\com\\huaiguang\\IOStudy\\a.txt","Start\\src\\com\\huaiguang\\IOStudy\\b.txt");
    }

    private static void copy(String sFile,String eFile) throws IOException {  // 输入源文件及复制的目的地
        InputStream fis = new FileInputStream(sFile);
        byte[] bytes = new byte[10240];
        int len = 0;
        while ((len = fis.read(bytes)) != -1 ){
            System.out.println(new String(bytes,0,len));     // 数组转string，offset表示开始转换的索引，len表示转换的个数
        }
        OutputStream fos = new FileOutputStream(eFile);
        fos.write(bytes);
        System.out.println("Succeeded Copy");
    }
}
