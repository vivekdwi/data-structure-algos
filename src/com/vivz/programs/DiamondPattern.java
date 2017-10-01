package com.vivz.programs;

import java.util.Scanner;

/**
 * {@link DiamondPattern} class is an Example of
 * Diamond Pattern
 * Created by vivekdwivedi on 10/1/2017.
 */
public class DiamondPattern {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);
        System.out.println("Enter Number of Rows : ");
        int rows = lScanner.nextInt();
        int space = rows -1;
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            space--;
            for(int j=1;j <= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
        for(int i=1; i<=rows-1; i++){
            for(int j=1; j<= space; j++){
                System.out.print(" ");
            }
            space++;
            for(int j=1; j <= 2 * (rows-i) - 1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
