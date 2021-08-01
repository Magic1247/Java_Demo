package com.huaiguang.NetStudy;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class BSSever {
    public static void main(String[] args) throws IOException {
        ServerSocket sever = new ServerSocket(8888);
        while (true){
            Socket socket = sever.accept();
            InputStream is = socket.getInputStream();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        BufferedReader br = new BufferedReader(new InputStreamReader(is));
                        String s = br.readLine();
                        String path = s.split(" ")[1].substring(1);
                        System.out.println("读取完毕"+path);
                        FileInputStream fis = new FileInputStream(path);
                        byte[] bytes1= new byte[1024];
                        int len1;
                        OutputStream os = socket.getOutputStream();
                        os.write("HTTP/1.1 200 OK\r\n".getBytes());
                        os.write("Content-Type: text/html;charset=utf-8\r\n".getBytes());
                        os.write("\r\n".getBytes());
                        while ((len1 = fis.read(bytes1))!=-1){
                            os.write(bytes1,0,len1);
                        }
                        System.out.println("0");
                    }catch (IOException e){
                        System.out.println(e);
                    }

                }
            }).start();
        }
    }
}
