package cn.zyh.USBTEST;

public class KeyBoard implements USB{
    @Override
    public void usbON() {
        System.out.println("打开键盘");
    }

    @Override
    public void usbOFF() {
        System.out.println("关闭键盘");
    }
    public void type(){
        System.out.println("键盘输入功能启动");
    }
}
