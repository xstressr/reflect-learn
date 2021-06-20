package com.sjy.lambda;

public interface Bar {
    public int doSomething();
    public default int doSomethingElse() {
        return 1;
    }
}
