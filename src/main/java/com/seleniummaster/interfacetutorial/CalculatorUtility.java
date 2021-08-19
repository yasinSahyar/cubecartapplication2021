package com.seleniummaster.interfacetutorial;

public class CalculatorUtility {
    public static void main(String[] args) {

        //standard calculator
        StandardCalculator standardCalculator=new Calculator();
        standardCalculator.addTwoNumber(25.50,30.50);
        standardCalculator.multiplyTwoNumbers(10,20);
        standardCalculator.subtractTwoNumbers(100,35);
        standardCalculator.divideTwoNumbers(36,4);

        //scientific calculator
        System.out.println(ScientificCalculator.version);
        ScientificCalculator scientificCalculator=new Calculator();
        scientificCalculator.calculatePower(10,3);
        scientificCalculator.calculateSquareRoot(36);
        scientificCalculator.calculateAbsoluteValue(-100);
        scientificCalculator.printInformation("This is a scientific calculator , version "+ScientificCalculator.version);


    }
}
