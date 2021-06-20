package com.sjy.reflection.construtors;

import java.lang.reflect.Constructor;

public class TestConstructor {


    public static void main(String[] args) throws Exception{
        Class<?> personClass = Class.forName("com.sjy.reflection.construtors.Person");
        //获取所有的构造函数，包括私有的，不包括父类的
        Constructor<?>[] allConstructors = personClass.getDeclaredConstructors();
        //获取所有公有的构造函数，包括父类的
        Constructor<?>[] publicConstructors = personClass.getConstructors();
        System.out.println("遍历之后的构造函数：");
        for(Constructor c1 : allConstructors) {
            System.out.println(c1);
        }

        Constructor<?> c2 = personClass.getDeclaredConstructor(String.class);
        c2.setAccessible(true); // 设置是否可访问，因为该构造器是private的，所以要手动设置允许访问，如果构造器是public的就不用设置
        Object person = c2.newInstance("孙纪元");  //使用反射创建Person类的对象，并传入参数
        System.out.println(person.toString());
    }
}
