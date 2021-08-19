package com.seleniummaster.datatype;

public class ArithmeticOperatorsDemo {
    public static void main(String[] args) {
        //Calculate rectangle area--h*W
        //Premier of rectangle--(w+h)*2
        int width=35;
        int height=25;
        int area=width*height;
        int premeier=2*(width+height);
        System.out.println("Area of rectangle is: "+area);
        System.out.println("Premier of rectangle is: "+premeier);
        float division=(float)width/height;
        System.out.printf("division=%f \n",division);
        //% reminder
        System.out.println(5%3);//2
        System.out.println(9%8);
        //Increment  decrement
        int i=1;
        int j=2;
        i++;//i+1
        j--;//j-1
        System.out.println(i);//2
        System.out.println(j);//1
        i++;//i+1
        j--;//j-1
        i=i+4;
        ++i;
        System.out.println(i);//3
        System.out.println(j);//0
    }
}
