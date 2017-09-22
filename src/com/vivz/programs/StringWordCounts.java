package com.vivz.programs;

import java.util.Scanner;

/**
 * Created by vivekdwivedi on 9/21/2017.
 */
public class StringWordCounts {
    public static void main(String[] args){
        System.out.println("Enter the String :: ");
        Scanner lScanner = new Scanner(System.in);
        String inputString = lScanner.nextLine();
        int wordCount = 1;
        for (int i = 0;i< inputString.length()-1;i++){
            if(inputString.charAt(i) == ' ' && (inputString.charAt(i+1) != ' ')){
                wordCount++;
            }
        }

        System.out.println("Number of Words in String :: "+wordCount);
        /*String[] words = inputString.trim().split(" ");
        System.out.println("Number of Words in String :: "+words.length);*/
    }
}
