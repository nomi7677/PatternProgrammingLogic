package com.firstpackage;

public class PatternFour {
    public static void main(String[] args) {
        int n=10;
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                if ( i == n - 1 ||  i - j >= 4 || i+j >=13 || i==4 && j==n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
