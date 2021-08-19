package com.seleniummaster.interfacetutorial;

public class Calculator implements StandardCalculator, ScientificCalculator, FormulaCalculator{
    @Override
    public double addTwoNumber(double a, double b) {
        double sum=a+b;
        System.out.println(String.format("%.2f + %.2f=%.2f",a,b,sum));
        return sum;
    }

    @Override
    public int multiplyTwoNumbers(int i1, int i2) {
        int result=i1*i2;
        System.out.println(String.format("%d * %d = %d",i1,i2,result));
        return result;
    }

    @Override
    public long subtractTwoNumbers(long l1, long l2) {
        System.out.println(String.format("%d - %d=%d",l1,l2,l1-l2));
        return l1-l2;
    }

    @Override
    public double divideTwoNumbers(double d1, double d2) {
        if(d2!=0)
        {
            float result=(float)(d1/d2);
            System.out.println(String.format("%.2f divide by %.2f is %.2f",d1,d2,result));
            return result;

        }
        else {
            System.out.println("Your denominator is zero");
            return 0;
        }
    }

    public double calculatePower(int base, int power) {
        double p=Math.pow(base,power);
        System.out.println(String.format("%d to the power of %d = %.2f",base,power,p));
        return p;
    }

    public double calculateSquareRoot(long l1) {
        double sr=Math.sqrt(l1);
        System.out.println(String.format("Square root of %d is %.2f",l1,sr));
        return sr;
    }

    public double calculateAbsoluteValue(int i1) {
        System.out.println(String.format("Absolute value of %d is %d",i1,Math.abs(i1)));
        return Math.abs(i1);
    }

    public void printInformation(String info) {
        System.out.println(info);
    }


    public void print() {
        System.out.println("This is no argument method in an interface");
    }

    public double findMaxNumbers(int n1, int n2) {
        return Math.max(n1,n2);
    }
}
