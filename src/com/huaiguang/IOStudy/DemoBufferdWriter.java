package com.huaiguang.IOStudy;

import java.io.*;

public class DemoBufferdWriter {
    public static void main(String[] args) throws IOException {
//        demoWriter();
        demoReder();
    }

    private static void demoReder() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("Start\\src\\com\\huaiguang\\IOStudy\\a.txt"));
        int len = 0;
        char[] cr = new char[1024];
//        while((len = br.read(cr)) != -1){
//            System.out.println(new String(cr,0,len));
//        }
        String s;
        while ((s = br.readLine()) != null){
            System.out.println(s);
        }
        br.close();
    }

    private static void demoWriter() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("Start\\src\\com\\huaiguang\\IOStudy\\a.txt"));
        for (int i = 0; i < 10; i++) {
            bw.write("test");
            bw.newLine();
        }
        bw.close();
    }
}
