package cn.zyh.StudyDome;

public class DomeHelloWorlds {
    public static void main(String[] args) {
        method(10);
    }
    public static void method(int a ){
        for(int b=0;b<a;b++){
            System.out.println("序号"+b+":"+"Hello,World");
        }
    }
}
