/*

INEURON PATTERN
*/

package com.firstpackage;

public class PatternTwo {
    public static void main(String[] args) {
        int number = 10;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i == 0 || i == number - 1 || j == number / 2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print(" ");

            for (int n = 0; n < number; n++) {
                if (n == 0 || n == number - 1 || n == i) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.print("   ");

            for (int e=0; e<number; e++){
                if(e==0|| i==0 || i==number/2 || i==number-1){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.print(" ");
            for	(int u=0;u<number;u++ ) {
                if(u==0&&i!=number-1||u==number-1&&i!=number-1|| i==number-1&&u>=2&&u<=7)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("   ");
            for(int r=0;r<number;r++) {
                if(i==0 || i==(number-1)/2 ||r==0 || r==(number-1) &&i<=(number-1)/2|| i==r&&r!=1&&r!=2&&r!=3)
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.print("   ");
            for(int o=0;o<number;o++) {
                if(o==0&&i!=0&&i!=number-1||o==number-1&&i!=0&&i!=number-1||i==0&&o!=0&&o!=number-1||i==number-1&&o!=0&&o!=number-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("   ");
            for(int n=0;n<number;n++) {
                if(n==0||n==number-1||n==i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println( );

        }
    }
}
