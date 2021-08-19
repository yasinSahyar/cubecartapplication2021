package com.seleniummaster.interfacetutorial;

public interface StandardCalculator {
    // Rule 1: define a method with return type
    //Rule 2:  arguments are optional
    //Rule 3: method do NOT have implementation
    //Rule 4: method can be void type
     String version="1.0";
    double addTwoNumber(double a, double b);
    int multiplyTwoNumbers(int i1, int i2);
    long subtractTwoNumbers(long l1, long l2);
    double divideTwoNumbers(double d1, double d2);
}
