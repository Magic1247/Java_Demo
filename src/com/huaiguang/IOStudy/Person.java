package com.huaiguang.IOStudy;

import java.io.Serializable;

public class Person implements Serializable {
    public String name;
    private int age;
    private static final long serialVersionUID = 1l;
    public int getTest() {
        return test;
    }

    public void setTest(int test) {
        this.test = test;
    }

    private transient int test;

    public Person(String name, int age, int test) {
        this.name = name;
        this.age = age;
        this.test = test;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", test=" + test +
                '}';
    }
}
