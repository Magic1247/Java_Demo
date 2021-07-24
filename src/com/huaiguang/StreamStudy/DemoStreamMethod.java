package com.huaiguang.StreamStudy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class DemoStreamMethod {
    public static void main(String[] args) {
        List<String> list  = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        Stream<String> stream = list.stream();
        long count = stream.map(str -> Integer.parseInt(str)).filter(integer -> integer <= 3).count();
        System.out.println(count);
        Stream<String> s2 = list.stream();
        s2.limit(3).forEach(s -> System.out.println(s));
        Stream<String> s3 = list.stream();
        s3.skip(3).forEach(s -> System.out.println(s)); // skip跳过并返回新流
        Stream<String> s4 = list.stream();
        Stream<String> s5 = list.stream();
//        Stream<String> skip = s4.skip(2);
//        s5.filter(s -> s.equals(4));
        Stream<String> concat = Stream.concat(s4, s5);
        concat.forEach(s -> System.out.println(s));
    }
}
