package com.huaiguang.NetStudy;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class FileUploadClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",8888);
        FileInputStream fis = new FileInputStream("D:\\test\\file\\test.txt");
        OutputStream os = socket.getOutputStream();
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes))!=-1){
            os.write(bytes,0,len);
        }
        socket.shutdownOutput();
        InputStream is = socket.getInputStream();
        byte[] bytes1 = new byte[1024];
        int len1 = 0;
        while ((len1=is.read(bytes1))!=-1){
            System.out.println(new String(bytes1,0,len1));
        }
        socket.close();
        fis.close();
        is.close();
    }
}
