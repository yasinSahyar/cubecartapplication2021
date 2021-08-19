package com.seleniummaster.classtutorial;

public class CalculatorDemo {


    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.printInformation();
        calculator.printSquareRoot(81);

        int x = calculator.addTwoNumbers(100, 300); //400
        calculator.addNumbers(x, 500);

        calculator.addNumbers(12, 15,16, 18, 90, 87, 75, 95);
        calculator.divideTwoNumbers(10, 2);
        calculator.multiplyTwoNumbers(15, 16);
        calculator.subtractNumbers(10000, 3500);

        System.out.println(calculator.addTwoNumbers(100,200));
        System.out.println(calculator.addTwoNumbers(1234567890, 908765432));
        System.out.println(calculator.addTwoNumbers("abc", "456"));

        Calculator.addTwoNumber(3, 4);

    }








}
