package com.huaiguang;

import java.io.IOException;


public class ShutDownWin {
    public static void main(String[] args) throws IOException {
        shutDownWin();
    }

    private static void shutDownWin() throws IOException {
        Runtime.getRuntime().exec("shutdown -s -t 3600");
    }

}
