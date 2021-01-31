package com.huaiguang.Study0131;

import java.util.Objects;

public class StudyException01 {
    public static void main(String[] args) {
        method(null);
    }

    private static void method(Object obj) {
        Objects.requireNonNull(obj,"传递参数为null");

    }

}
