package cn.start.TestStatic;

public class StaticMethod {
    static {
        System.out.println("静态代码块！");
    }
    public StaticMethod(){
        System.out.println("构造方法运行！");
    }
}
