package cn.zyh.DemoPhoneExtends;

public class Phone {
    public Phone(){
        System.out.println("父类无参构造执行");
    }
    public Phone(int num){
        System.out.println("父类有参构造执行");
    }
    public void call(){
        System.out.println("打电话");
    }
    public void sendMessage(){
        System.out.println("发短信");
    }
    public void show(){
        System.out.println("显示号码");
    }
}
