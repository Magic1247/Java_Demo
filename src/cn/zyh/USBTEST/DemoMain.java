package cn.zyh.USBTEST;

import java.util.Scanner;

public class DemoMain {
    public static void main(String[] args) {
        LapTop user1 = new LapTop();
        user1.powerON();
        USB usb = new Mouse();
//        KeyBord keyBord = new KeyBord();
//        user1.useDevices(keyBord); // 需要的参数USB比Keyboard大，keyboard发生了自动类型转换
        user1.useDevices(usb);
        Scanner s = new Scanner(System.in);
        System.out.println("请进行下一步操作：");
        String text = s.next();
        if (text.equals("关机")){
            user1.powerOFF();
        }else{
            System.out.println("内部异常");
        }

    }
}
