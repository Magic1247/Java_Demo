package cn.start.TestThis;

public class SayHello {
    String name;
    public void sayHello(String name){
        System.out.println(name+"你好，我是"+this.name);
        System.out.println(this);
    }
}
