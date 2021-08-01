package cn.start.USBTEST;



public class Mouse implements USB{

    @Override
    public void usbON() {
        System.out.println("打开鼠标");
    }

    @Override
    public void usbOFF() {
        System.out.println("关闭鼠标");
    }
    public void click(){
        System.out.println("鼠标点击");
    }
}
