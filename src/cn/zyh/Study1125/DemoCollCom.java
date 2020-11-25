package cn.zyh.Study1125;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DemoCollCom {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        Person p1 = new Person("张三",18);
        Person p2 = new Person("张三",145);
        Person p3 = new Person("张三",11);
        Person p4 = new Person("张三",10);
        Collections.addAll(list,p1,p2,p3,p4);
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getAge() - o1.getAge();
            }
        });
        System.out.println(list);
    }

}
