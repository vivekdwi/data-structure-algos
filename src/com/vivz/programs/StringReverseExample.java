package com.vivz.programs;

import java.util.Optional;
import java.util.Scanner;

/**
 * {@link StringReverseExample} Class is an Example
 * of String Reverse Using String Buffer, String Builder
 * and custom util method.
 *
 * Created by vivekdwivedi on 9/4/2017.
 */
public class StringReverseExample {
    public static void main(String[] args){
        Scanner lScanner = new Scanner(System.in);
        System.out.println("Enter Sentence To Reverse : ");
        String lWord = lScanner.nextLine();

        // String Reverse Using StringBuffer
        String lReverse = new StringBuffer(lWord).reverse().toString();
        System.out.println("**** String Reverse Using StringBuffer ****");
        System.out.printf(" original String : %s , reversed String %s  %n", lWord, lReverse);

        //String Reverse Using StringBuilder
        lReverse = new StringBuilder(lWord).reverse().toString();
        System.out.println("**** String Reverse Using StringBuilder ****");
        System.out.printf(" original String : %s , reversed String %s %n", lWord, lReverse);

        //String Reverse Using Custom Util Method
        lReverse = reverseString(lWord);
        System.out.println("String Reverse Using Custom Util Method ****");
        System.out.printf(" original String : %s , reversed String %s %n", lWord, lReverse);
    }

    /**
     * reverseString() Reverses the Source String and returns
     * the reverse String.
     *
     * @param lSourceString
     * @return
     */
    private static String reverseString(String lSourceString){
        Optional<String> optionalTypeDirName = Optional.ofNullable(lSourceString);

        if(!optionalTypeDirName.isPresent()){
            return lSourceString;
        }

        String lReverse = "";
        for(int i = lSourceString.length() -1; i>=0; i--){
            lReverse = lReverse + lSourceString.charAt(i);
        }
        return lReverse;
    }
}
