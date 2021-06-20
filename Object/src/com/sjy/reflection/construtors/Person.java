package com.sjy.reflection.construtors;

public class Person {
    private int age;
    private String name;
    public Person() {
    }
    private Person(String name) {
        this.name = name;
    }

    public Person(int age,String name){
        this.age = age;
        this.name = name;
    }

    // 省略set/get方法


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
