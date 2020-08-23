package cn.zyh.DemoThis;

public class DemoThis01 extends  Fu{

    public DemoThis01(){
        this(10);           // 3、调用本类的其他构造方法
    }
    public DemoThis01(int num){

    }
    int num = 10;
    public void test(){
        int num = 10;
        System.out.println(num);      // 方法的局部变量
        System.out.println(this.num);  // 1、访问本类的成员变量
    }
    public void methodA(){
        System.out.println("AAA");
    }
    public void methidB(){
        this.methodA();     // 2、访问本类的成员方法
        System.out.println("BBB");
    }
}
