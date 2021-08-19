package com.seleniummaster.loops;

public class BreakDemo {
    public static void main(String[] args) {
//        int i=0;
//        for(i=1;i<10;i++){
//            if(i>6) {
//                break;
//            }
//                System.out.println(i);
//            }
        //System.out.println(i);

        for(int j=1;j<=10;j++) {
            if (j % 4 == 0) {
                break;
            }
            System.out.println(j);
        }
        }
    }

