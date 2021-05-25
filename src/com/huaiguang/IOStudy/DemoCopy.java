package com.huaiguang.IOStudy;

import java.io.*;

public class DemoCopy {
    public static void main(String[] args) throws IOException{
        copy("Start\\src\\com\\huaiguang\\IOStudy\\a.txt","Start\\src\\com\\huaiguang\\IOStudy\\b.txt");
    }

    private static void copy(String sFile,String eFile) throws IOException {  // 输入源文件及复制的目的地
        InputStream fis = new FileInputStream(sFile); // 多态创建文件输入流，读取源文件
        byte[] bytes = new byte[10240];               // 创建字节数组
        int len = 0;                                  // 定义初始值
        while ((len = fis.read(bytes)) != -1 ){       // 文件结束标识jvm返回-1,将read()返回值赋值给len, 当read()返回不为-1时循环读取文件
            System.out.println(new String(bytes,0,len));     // 数组转string，offset表示开始转换的索引，len表示转换的个数
        }
        OutputStream fos = new FileOutputStream(eFile);  // 创建文件输出流。写入文件
        fos.write(bytes);                                // 将读取到的字节数组写入复制目的地
        System.out.println("Succeeded Copy");
    }
}
