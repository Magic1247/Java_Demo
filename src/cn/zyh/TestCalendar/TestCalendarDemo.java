package cn.zyh.TestCalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalendarDemo {
    public static void main(String[] args) {
//        demo1();
//        demo2();
//        demo3();
//        demo4();
            demo5();

    }

    private static void demo5() {
        Calendar c = Calendar.getInstance();
        Date time = c.getTime();
        System.out.println(time);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy--MM--dd--HH--mm--ss");
        String format = sdf.format(time);
        System.out.println(format);
    }

    private static void demo4() {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.YEAR,100);
        System.out.println(c.get(Calendar.YEAR));
    }

    private static void demo3() {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR,9999);
        c.set(8888,8,8);
        int i = c.get(Calendar.YEAR);
        System.out.println(i);
        int m = c.get(Calendar.MONTH);
        System.out.println(m+1);
        int d = c.get(Calendar.DATE);
        System.out.println(d);
        int h = c.get(Calendar.HOUR);
        System.out.println(h);
        int min = c.get(Calendar.MINUTE);
        System.out.println(min);
        int s = c.get(Calendar.SECOND);
        System.out.println(s);
    }

    private static void demo2() {
        Calendar c = Calendar.getInstance();
        int i = c.get(Calendar.YEAR);
        System.out.println(i);
        int m = c.get(Calendar.MONTH);
        System.out.println(m+1);
        int d = c.get(Calendar.DATE);
        System.out.println(d);
        int h = c.get(Calendar.HOUR);
        System.out.println(h);
        int min = c.get(Calendar.MINUTE);
        System.out.println(min);
        int s = c.get(Calendar.SECOND);
        System.out.println(s);


    }

    private static void demo1() {
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        c.getTime();

    }
}
