package cn.zyh.DomePhone;

public class DomePhoneReturn {
    public static void main(String[] args) {
        Phone q = GetPhone();
        System.out.println(q.prise);
    }
    public static Phone GetPhone(){
        Phone a = new Phone();
        a.prise = 8888.0;
        return a;
    }
}
