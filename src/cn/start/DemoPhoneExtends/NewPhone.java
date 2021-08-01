package cn.start.DemoPhoneExtends;

public class NewPhone extends Phone{
    public NewPhone(){
        super(10);     // 有参构造父类方法，父类方法只能构造一次，如果不写super调用编译时默认赠送super();
        System.out.println("子类方法无参构造");
    }

    @Override
    public void show() {
        super.show();
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
}
