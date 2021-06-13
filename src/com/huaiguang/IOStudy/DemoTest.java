package com.huaiguang.IOStudy;

import java.io.*;
import java.util.HashMap;

public class DemoTest {
    public static void main(String[] args) throws IOException {
        demo();
    }

    private static void demo() throws IOException {
        // 创建HashMap 存放文本，key为序号，value为文本
        HashMap<String,String> map = new HashMap<>();
        // 创建字符读取缓冲流，按行读取待排序文本
        BufferedReader br = new BufferedReader(new FileReader("Start\\src\\com\\huaiguang\\IOStudy\\in.txt"));
        // 创建字符输出缓冲流，将排序后的文本写入新文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("Start\\src\\com\\huaiguang\\IOStudy\\out.txt"));
        // 按行读取文本
        String line;
        while ((line = br.readLine()) != null){
            // 按 . 分割读到的行文本
            String[] arr = line.split("\\.");
            //将.前的文本为key，.后的文本作为value存入HashMap
            map.put(arr[0],arr[1]);
        }
        // 遍历HashMap
        for(String key : map.keySet()){
            String s = map.get(key);
            // 将排序后的键值对拼接
            line = key + "." + s;
            // 写入新文件
            bw.write(line);
            bw.newLine();
        }
        // 关闭流，释放资源
        br.close();
        bw.close();
    }
}
