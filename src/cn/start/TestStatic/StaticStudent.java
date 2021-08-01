package cn.start.TestStatic;

public class StaticStudent {
    private int id;         // 成员变量ID
    private String name;
    private int age;
    static String room;
    private static int idCounter = 0;  //类的静态ID，作用：自增后赋值给成员变量ID计数

    public StaticStudent() {
        this.id = ++idCounter;
    }

    public StaticStudent(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCounter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
