package com.vivz.programs;

import java.util.Scanner;

/**
 * Created by vivekdwivedi on 9/21/2017.
 */
public class RemoveWhiteSpaceFromString {
    public static void main(String[] args){
        System.out.println("Enter input string :: ");
        Scanner lScanner = new Scanner(System.in);
        String inputString = lScanner.nextLine();
        String stringWithoutSpace = inputString.replaceAll("\\s","");
        System.out.println(stringWithoutSpace);

        char[] strArray = inputString.toCharArray();
        StringBuffer lStringBuffer = new StringBuffer();
        for(int i=0; i<strArray.length;i++){
            if((strArray[i] != ' ') && (strArray[i] != '\t')){
                lStringBuffer.append(strArray[i]);
            }
        }
        System.out.println(lStringBuffer);
    }
}
