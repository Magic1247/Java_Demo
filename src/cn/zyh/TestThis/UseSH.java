package cn.zyh.TestThis;

public class UseSH {
    public static void main(String[] args) {
        SayHello us = new SayHello();
        us.name = "王健林";
        us.sayHello("王思聪");
        System.out.println(us);
    }
}
