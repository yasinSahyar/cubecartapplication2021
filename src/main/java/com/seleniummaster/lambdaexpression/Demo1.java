package com.seleniummaster.lambdaexpression;

@FunctionalInterface
public interface Demo1 {
    void book();
    default void sum(){
        System.out.println("Sum method");
    }
    static void multiply(int a,int b){
        System.out.println(a*b);
    }
}

//class Test implements Demo1{
//
//    @Override
//    public void book() {
//        System.out.println("Reading book....");
//    }
//}

class Test1{
    public static void main(String[] args) {
//        Demo1 demo1=new Test();
//        demo1.book();

        Demo1 demo1=()-> System.out.println("Reading book...");
        demo1.book();
    }
}
