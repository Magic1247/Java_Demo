package cn.zyh.student;

public class DemoStudent02 {
    public static void main(String[] args) {
        DemoStudent studentUse = new DemoStudent();
        studentUse.eat();
        System.out.println(studentUse.name );
        System.out.println(studentUse.age );
        System.out.println(studentUse.sex );
        studentUse.name = "蔡徐坤";
        studentUse.age = 18;
        studentUse.sex = '女';
        System.out.println(studentUse.name );
        System.out.println(studentUse.age );
        System.out.println(studentUse.sex );
        System.out.println(studentUse.sex == '男' );
        studentUse.study(2);


    }
}
