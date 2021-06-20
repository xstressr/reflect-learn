package com.sjy.lambda.defaultLearn;

public class DefaultImpl implements Default{

//    @Override
//    public void method() {
//        System.out.println("method in Class");
//    }

    public static void main(String[] args) {
        Default d = new DefaultImpl();
        d.method();
    }
}
