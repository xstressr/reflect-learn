package com.sjy.lambda.defaultLearn;

public interface Default {
    default public void method() {
        System.out.println("method in interface");
    }
}
