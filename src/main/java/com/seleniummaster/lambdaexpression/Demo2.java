package com.seleniummaster.lambdaexpression;

public interface Demo2 {

    void sum(int a,int b);
}

class Test {
    public static void main(String[] args) {
        Demo2 demo2 = (a, b) -> System.out.println(a + b);
        demo2.sum(10,20);
    }
}
