package cn.start.DemoSuper;

public class ExtendsTest extends StudySuper{
    public ExtendsTest(){
        super();    // 3、构造父类方法
    }
    public void main(String[] args) {
        System.out.println(super.num);// 1、访问父类成员变量
        super.method();  // 2、访问父类成员方法
    }
}
