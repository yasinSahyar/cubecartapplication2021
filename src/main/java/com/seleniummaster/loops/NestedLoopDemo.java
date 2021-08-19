package com.seleniummaster.loops;

import java.util.Scanner;

public class NestedLoopDemo {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int lineNumber = scanner.nextInt();
//        for (int i = 1; i <= lineNumber; i++) {
//            System.out.println("******");
//        }

        for(int i=1;i<=4;i++){//outer loop represent row
            for(int j=1;j<=i;j++){//1 2 3 4
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("-----------------------------------------");

        for(int i=1;i<=5;i++){//outer loop represent row
            for(int j=6;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("_______________________________________________");

        for(int i=1;i<=5;i++){//outer loop represent row
            int j=6;
            while(j>i){
                System.out.print("* ");
                j--;
            }
            System.out.println();
        }
    }
    }

