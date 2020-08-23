package cn.zyh.DemoExtends;
import cn.zyh.StudyDemo.HelloWorld;

public class Zi extends Fu{
    int num = 20;
    public void method(){
        int num = 30;
        System.out.println(num);   // 方法的成员变量
        System.out.println(this.num); // 本类的成员变量
        System.out.println(super.num); // 父类（超类）的成员变量
        HelloWorld.main();
    }
}
