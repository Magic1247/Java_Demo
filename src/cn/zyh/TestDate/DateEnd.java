package cn.zyh.TestDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateEnd {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Scanner sc  = new Scanner(System.in);
        System.out.println("请输入出生日期（格式:yyyy-MM-dd）:");
        String birthDayTime = sc.next();
        Date  birthDayDate = sdf.parse(birthDayTime);
        long  bs = birthDayDate.getTime();
        long  nows = new Date().getTime();
        long  time = nows - bs;
        long passTime = time/1000/60/60/24;
        System.out.println("您已经来到这个世界"+passTime+"天");

    }
}
