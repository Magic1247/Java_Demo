package cn.zyh.USBTEST;

public class DemoMain2 {
    public static void main(String[] args) {
        USB usb = new KeyBoard();
        usb.usbON();
        KeyBoard keyBoard = (KeyBoard)usb;
        keyBoard.type();
    }
}
