package com.sjy.lambda;

public class FunctionalConsumer {
    public void consumeFoo(Foo foo) {
        System.out.println(foo.doSomething());
    }
    public void consumeBar(Bar bar) {
        System.out.println(bar.doSomething());
    }

    public static void main(String[] args) {
        FunctionalConsumer consumer = new FunctionalConsumer();
        consumer.consumeBar(()->10);
        consumer.consumeFoo(()->20);
        consumer.consumeBar(()->1);
    }
}


