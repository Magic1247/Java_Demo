package cn.zyh.DemoOverRide;

public class Zi  extends  Fu{
    @Override       // 只是注解，不写也是方法重写，如果下方方法不构成重写，该注解报错
    public void method(){      // 返回值类型必须小于等于被重写父类方法，权限必须大于等于被重写父类方法
        System.out.println("子类方法执行！！！");
    }
}
