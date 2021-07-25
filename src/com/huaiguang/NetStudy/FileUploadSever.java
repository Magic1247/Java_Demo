package com.huaiguang.NetStudy;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FileUploadSever {
    public static void main(String[] args) throws IOException {
        ServerSocket sever = new ServerSocket(8888);
        Socket accept = sever.accept();
        FileOutputStream fos = new FileOutputStream("D:\\test\\uploadfile\\testuploadfile01.txt");
        InputStream is = accept.getInputStream();
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = is.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        accept.getOutputStream().write("上传成功".getBytes());
        sever.close();
        fos.close();
        is.close();
    }
}
