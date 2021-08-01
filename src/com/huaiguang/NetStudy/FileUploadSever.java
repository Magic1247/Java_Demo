package com.huaiguang.NetStudy;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class FileUploadSever {
    public static void main(String[] args) throws IOException {
        ServerSocket sever = new ServerSocket(8888);
        while(true){
            Socket accept = sever.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                        String name = "test"+System.currentTimeMillis()+(new Random().nextInt(99999))+".txt";
                        FileOutputStream fos = new FileOutputStream("D:\\test\\uploadfile\\"+name);
                        InputStream is = accept.getInputStream();
                        byte[] bytes = new byte[1024];
                        int len = 0;
                        while ((len = is.read(bytes))!=-1){
                            fos.write(bytes,0,len);
                        }
                        accept.getOutputStream().write("上传成功".getBytes());
//            sever.close();
                        fos.close();
                        is.close();
                    }catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();

        }
    }
}
