package cn.zyh.DemoPhone;

public class DemoPhonePram {
    public static void main(String[] args) {

        Phone MiPhone = new Phone();
        MiPhone.brand = "小米";
        MiPhone.color = "黑色";
        MiPhone.prise = 1999.0;
        pram(MiPhone);

    }
    public static void pram(Phone a){
        System.out.println(a.brand);
        System.out.println(a.color);
        System.out.println(a.prise);
        a.call(112);
    }
}
