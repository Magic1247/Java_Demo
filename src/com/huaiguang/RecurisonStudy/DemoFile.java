package com.huaiguang.RecurisonStudy;

import java.io.File;
import java.io.FileFilter;

public class DemoFile {
    public static void main(String[] args) {
//        getAllFile(new File("F:\\OneDrive\\"));
//        System.out.println(new File("F:\\ADBTest\\"));
        getFile(new File("F:\\basic_code"));
    }

    private static void getAllFile(File f) {
        File[] files = f.listFiles();  // 获取文件列表
        for (File f2 : files){      // 遍历文件夹
            if(f2.isDirectory()){  // 如果是文件夹调用该
                getAllFile(f2);
            }else {
                if(f2.getName().toLowerCase().endsWith(".java")){   // 只输出.java结尾的文件
                    System.out.println(f2);
                }

            }
        }
    }
    private static void getFile(File f){
//        File[] files = f.listFiles(new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                if(pathname.isDirectory()){
//                    return true;
//                }
//                return pathname.getName().toLowerCase().endsWith(".java");
//            }
//        });
        File[] files = f.listFiles((dir,name) -> new File(dir,name).isDirectory() || new File(dir,name).getName().toLowerCase().endsWith(".java"));

        for(File f2 : files){
            if(f2.isDirectory()){
                getFile(f2);
            }else {
                System.out.println(f2);
            }
        }
    }

}
