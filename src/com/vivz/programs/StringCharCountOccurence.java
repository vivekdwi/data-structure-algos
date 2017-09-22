package com.vivz.programs;

import java.util.Scanner;

/**
 * Created by vivekdwivedi on 9/21/2017.
 */
public class StringCharCountOccurence {
    public static void main(String[] args){
        System.out.println("Enter the string :: ");
        Scanner lScanner = new Scanner(System.in);
        String inputString = lScanner.nextLine();
        System.out.println("Enter the character for occurence count :: ");
        String inputChar = lScanner.next();

        int count = inputString.length() - inputString.replace(inputChar,"").length();
        System.out.println("Number of Occurences of '"+inputChar+"' in String '"+inputString+"' is : "+count);
    }
}
