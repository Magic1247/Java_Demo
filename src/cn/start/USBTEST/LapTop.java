package cn.start.USBTEST;

import java.util.Scanner;

public class LapTop  {
    public void  powerON(){
        System.out.println("笔记本电脑开机");
    }
    public void powerOFF(){
        System.out.println("笔记本电脑关机");
    }
    public void useDevices(USB usb){
        if(usb instanceof KeyBoard){
            shixian(usb);
        }else if(usb instanceof Mouse){
            shixian(usb);
        }else{
            System.out.println("内部异常");
        }

    }
    private static void shixian(USB usb1){
        Scanner s = new Scanner(System.in);
        System.out.println("USB设备已接入，请选择打开/关闭：");
        String text = s.next();
        if(text.equals("打开")){
            usb1.usbON();
        }else if(text.equals("关闭")){
            usb1.usbOFF();
        }else if(text.equals("输入文字")){
            KeyBoard keyBoard = (KeyBoard)usb1;
            keyBoard.type();
        }else if(text.equals("点击")){
            Mouse mouse = (Mouse)usb1;
            mouse.click();
        }else{
            System.out.println("内部异常");
        }
    }
    
}
