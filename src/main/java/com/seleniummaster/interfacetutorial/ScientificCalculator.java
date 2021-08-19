package com.seleniummaster.interfacetutorial;

public interface ScientificCalculator {
    // Rule 1: define a method with return type
    //Rule 2:  arguments are optional
    //Rule 3: method do NOT have implementation
    //Rule 4: method can be void type

    String version="1.0";
   double calculatePower(int base, int power);
   double calculateSquareRoot (long l1);
   double calculateAbsoluteValue(int i1);
   void printInformation(String info);
   void print();

}
