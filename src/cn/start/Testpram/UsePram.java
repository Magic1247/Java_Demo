package cn.start.Testpram;

public class UsePram {
    public static void main(String[] args) {

        Pram up = new Pram("蔡徐坤",18);
        Pram up2 = new Pram();
        up.setAge(21);
        up.setName("鹿晗");
        System.out.println(up.getAge()+up.getName());

    }
}
