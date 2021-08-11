package com.huaiguang.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)  // 该注解可用于类层级
@Retention(RetentionPolicy.RUNTIME)  // 该注解保留至运行时阶段
public @interface GetRunName {
    String className();

    String methodName();
}
