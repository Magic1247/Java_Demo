package com.huaiguang.StreamStudy;

import java.util.stream.Stream;

public class DemoStreamForEach {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("吴亦凡", "鹿晗", "张艺兴", "肖战");
        stream1.forEach(name -> System.out.println(name));
    }
}
