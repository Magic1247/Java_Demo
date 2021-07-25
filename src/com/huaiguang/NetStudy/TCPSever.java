package com.huaiguang.NetStudy;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPSever {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务启动");
            Socket accept = serverSocket.accept();
            InputStream is = accept.getInputStream();
            byte[] bytes = new byte[1024];
            int len = is.read(bytes);
            System.out.println(new String(bytes,0,len));
            OutputStream sos = accept.getOutputStream();
            sos.write("收到".getBytes());
            accept.close();
            serverSocket.close();
            System.out.println("释放服务器资源");
    }
}
