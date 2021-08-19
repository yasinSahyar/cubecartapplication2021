package com.seleniummaster.classtutorial;

public class NestedClassDemo {
    private void print(){
        System.out.println("This is root class(Outer Class)");
    }

    class InnerClassA{
        private int sum(int a,int b){
            System.out.println(String.format("%d+%d=%d",a,b,a+b));
            return a+b;
        }
    }

    static class InnerClassB{
        private long multiply(int a,int b){
            return a*b;
        }
    }

    public static void main(String[] args) {
        NestedClassDemo nestedClassDemo=new NestedClassDemo();
        nestedClassDemo.print();
        NestedClassDemo.InnerClassA innerClassA=new NestedClassDemo().new InnerClassA();
        innerClassA.sum(10,200);
        InnerClassB innerClassB=new InnerClassB();
        System.out.println(innerClassB.multiply(10,20));

    }


}


