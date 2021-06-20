package com.sjy.reflection;

class Test {
    public static void main(String[] args) throws ClassNotFoundException {
/*        Class c1 = Test.class; 这说明任何一个类都有一个隐含的静态成员变量class，这种方式是通过获取类的静态成员变量class得到的
        Class c2 = test.getClass(); test是Test类的一个对象，这种方式是通过一个类的对象的getClass()方法获得的
        Class c3 = Class.forName("com.catchu.me.reflect.Test"); 这种方法是Class类调用forName方法，通过一个类的全量限定名获得*/
        Class<Test> class1 = Test.class;
        System.out.println("类名1：" + class1.getName());

        Test Test = new Test();
        Class<? extends Test> class2 = Test.getClass();
        System.out.println("类名2："  + class2.getName());

        Class<?> class3 = Class.forName("com.sjy.reflection.Test");
        System.out.println("类名3："  + class3.getName());
        if (class1==class2) {
            System.out.println("class1==class2");
        }
        if (class1==class3) {
            System.out.println("class1==class3");
        }
    }
}
