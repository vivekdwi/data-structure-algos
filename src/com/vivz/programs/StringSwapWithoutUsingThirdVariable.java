package com.vivz.programs;

import java.util.Scanner;

/**
 * Created by vivekdwivedi on 9/22/2017.
 */
public class StringSwapWithoutUsingThirdVariable {
    public static void main(String[] args){
        Scanner lScanner = new Scanner(System.in);
        System.out.println("Enter 1st String :: ");
        String str1 = lScanner.nextLine();
        System.out.println("Enter 2nd String :: ");
        String str2 = lScanner.nextLine();

        System.out.println("Before Swapping :: ");
        System.out.println("str1 :: "+str1);
        System.out.println("str2 :: "+str2);

        str1 = str1 + str2;
        str2 = str1.substring(0,str1.length() - str2.length());
        str1 = str1.substring(str2.length());

        System.out.println("After Swapping :: ");
        System.out.println("str1 :: "+str1);
        System.out.println("str2 :: "+str2);
    }
}
