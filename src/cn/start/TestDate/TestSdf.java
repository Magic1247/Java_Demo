package cn.start.TestDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSdf {
    public static void main(String[] args) throws ParseException {
        demo1();
        demo2();
    }

    private static void demo2() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
        Date date = sdf.parse("2020年08月12日22时20分13秒");
        System.out.println(date);
    }

    private static void demo1() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
        Date date = new Date();
        System.out.println(date);
        String text = sdf.format(date);
        System.out.println(text);
    }
}
