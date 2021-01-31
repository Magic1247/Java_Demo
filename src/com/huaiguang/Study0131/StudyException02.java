package com.huaiguang.Study0131;

import java.io.FileNotFoundException;
import java.io.IOException;

public class StudyException02 {
    public static void main(String[] args) throws IOException {
        reasFile("C://a.txt");
    }

    private static void reasFile(String fileNmae) throws IOException {
        if (!fileNmae.equals("C://a.txt")) {
            throw new FileNotFoundException("文件名不符");}
        if (!fileNmae.endsWith(".tx")) {
            throw new IOException("文件格式不符");
            }
        }
    }


