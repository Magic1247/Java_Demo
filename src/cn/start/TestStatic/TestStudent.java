package cn.start.TestStatic;

public class TestStudent {
    public static void main(String[] args) {
        StaticStudent one = new StaticStudent("蔡徐坤",19);
        one.room = "台北101";
        StaticStudent two = new StaticStudent("吴亦凡",20);
        System.out.println("姓名"+one.getName()+"年龄"+one.getAge()+"班级"+one.room+"学号"+one.getId());
        System.out.println("姓名"+two.getName()+"年龄"+two.getAge()+"班级"+two.room+"学号"+two.getId());
    }
}
