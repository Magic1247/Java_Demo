package com.huaiguang.NetStudy;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FileUploadSever {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket accept = serverSocket.accept();
        InputStream sis = accept.getInputStream();
        byte[] bytes = new byte[1024];
        int len = 0;
        // 创建本地文件输出流，用于将读取到的文件字节流，写入本地磁盘
        FileOutputStream fos = new FileOutputStream("F:\\basic_code\\Start\\src\\com\\huaiguang\\NetStudy\\testupload.png");
        while ((len=sis.read(bytes))!=-1){
            fos.write(bytes,0,len);
            System.out.println("上传中");
        }
        System.out.println("上传完毕，通知客户端");
//        accept.getOutputStream().write("上传成功".getBytes());
        accept.close();
        fos.close();
        serverSocket.close();
    }
}
