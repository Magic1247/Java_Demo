package cn.start.student;

public class DemoStudent {
    String name;
    int age;
    char sex;

    public void eat() {
        System.out.println("吃饭！");
    }

 

    public void sleep() {
        System.out.println("睡觉");

        }
    public void study(int a){
        if(a==1){
            System.out.println("学习");
        }else {
            System.out.println("学习，学个屁！");
        }

    }
}

