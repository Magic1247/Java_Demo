package com.huaiguang.NetStudy;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class FileUploadClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",9999);
        // 创建本地文件读取流，读取待上传文件
        FileInputStream fis = new FileInputStream("F:\\basic_code\\Start\\src\\com\\huaiguang\\IOStudy\\testpic.png");
        //创建网络流用于输出读取到的文件字节流
        OutputStream os = socket.getOutputStream();
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len=fis.read(bytes))!=-1){
            // 读取已加载到内存中的文件字节，并使用网络输出流写入
            os.write(bytes,0,len);
        }
//        byte[] bytes1 = new byte[1024];
//        InputStream is = socket.getInputStream();
//        int len1;
//        while ((len1=is.read(bytes1))!=-1){
//            System.out.println(new String(bytes1,0,len1));
//        }
        fis.close();
    }
}
