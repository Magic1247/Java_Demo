package cn.zyh.DemoStudent;

public class UseStudent {
    public static void main(String[] args) {
        Student aj = new Student();
        aj.setMale(true);
        aj.setAge(10);
        aj.setName("蔡徐坤");
        System.out.println("姓名："+aj.getName()+"年龄："+aj.getAge()+"性别:"+aj.isMale());
    }
}
