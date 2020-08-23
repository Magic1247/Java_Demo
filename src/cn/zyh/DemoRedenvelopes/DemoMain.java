package cn.zyh.DemoRedenvelopes;

import java.util.ArrayList;

public class DemoMain {
    public static void main(String[] args) {
        Leader leader = new Leader("吴亦凡",100);
        Member one = new Member("群员A",0);
        Member two = new Member("群员B",0);
        Member three = new Member("群员C",0);
        leader.show();
        one.show();
        two.show();
        three.show();
        System.out.println("====================");
        ArrayList<Integer> red = leader.send(20,3);
        one.receive(red);
        two.receive(red);
        three.receive(red);
        System.out.println("===================");
        leader.show();
        one.show();
        two.show();
        three.show();
    }
}
