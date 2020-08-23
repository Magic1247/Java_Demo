package cn.zyh.DemoPhone;

public class Phone {
    String brand;
    double prise;
    String color;

    public void call(int a) {
        System.out.println(a+"呼叫中~~~");
    }
    public void seedMessage(String who){
        System.out.println("SeedMessage to"+who);

    }
    public int[] arrayTest(int a,int b,int c,int d){
        int[] result={a,b,c,d};
        return result;
    }
}
