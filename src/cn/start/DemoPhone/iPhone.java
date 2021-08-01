package cn.start.DemoPhone;

public class iPhone {
    public static void main(String[] args) {
        Phone iPhone = new Phone(); //创建对象 iPhone
        iPhone.brand = "苹果";
        iPhone.color = "玫瑰金";
        iPhone.prise = 10000;
        System.out.println(iPhone.brand);
        System.out.println(iPhone.color);
        //
        System.out.println(iPhone.prise);
        iPhone.call(110);         //调用call方法参数a：110
        System.out.println("==================");

        Phone GalaxyPhone = new Phone();//创建对象 GalaxyPhone
        GalaxyPhone.brand = "SAMSUNG";
        GalaxyPhone.color = "黑色";
        GalaxyPhone.prise = 6999;
        GalaxyPhone.call(120);
        System.out.println(GalaxyPhone.brand);
        System.out.println(GalaxyPhone.color);
        System.out.println(GalaxyPhone.prise);
        GalaxyPhone.seedMessage("i冰宇宙"); //调用seedMessage方法参数who：i冰宇宙
        System.out.println(GalaxyPhone.arrayTest(1,2,3,4)[0]);//调用arrayTest方法并打印arrayTest返回数组的一号元素
        int[] q = GalaxyPhone.arrayTest(11,22,33,44);       //新建数组 q接受arrayTest返回值
        for (int i = 0; i < q.length; i++) {            //遍历数组q
            System.out.println(q[i]);
        }


    }

}
