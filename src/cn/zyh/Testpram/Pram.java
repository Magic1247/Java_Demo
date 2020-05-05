package cn.zyh.Testpram;

public class Pram {
    private String name;
    private int age;
    public Pram(){
        System.out.println("无参构造测试");
    }
    public  Pram(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println(this.name+this.age);
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;

    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}
