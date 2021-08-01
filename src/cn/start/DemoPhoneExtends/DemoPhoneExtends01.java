package cn.start.DemoPhoneExtends;

public class DemoPhoneExtends01 {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.call();
        phone.sendMessage();
        phone.show();
        System.out.println("================");
        NewPhone iPhone = new NewPhone();
        iPhone.call();
        iPhone.sendMessage();
        iPhone.show();
    }
}
