package com.sjy.reflection.methods;

import com.sjy.reflection.construtors.Person;

import java.lang.reflect.Method;

public class TestMethod {
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        Class<? extends Person> personClass = person.getClass();
        Method[] allMethods = personClass.getDeclaredMethods();
        Method[] publicMethods = personClass.getMethods();
        System.out.println("遍历所有的方法：");
        for(Method m : allMethods) {
            System.out.println(m);
        }

        // 下面是测试通过反射调用函数
        // 通过反射创建实例对象，默认调无参构造函数
        Person person2 = personClass.newInstance();
        // 获取要调用的方法，要调用study方法，包含int和String参数，注意int和Integer在这有区别
        Method method = personClass.getMethod("study", int.class, String.class);
        Object o = method.invoke(person2, 18, "孙纪元");
    }
}
