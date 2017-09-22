package com.vivz.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by vivekdwivedi on 9/22/2017.
 */
public class FirstRepeatedAndNonRepeatedChar {
    public static void main(String[] args){
        Scanner lScanner = new Scanner(System.in);
        System.out.println("Enter String :: ");
        String inputString  = lScanner.nextLine();
        firstRepeatedNonRepeatedChar(inputString);
    }

    private static void firstRepeatedNonRepeatedChar(String inputString){
        Map<Character,Integer> charCountMap = new HashMap<>();

        char[] strArray = inputString.toCharArray();

        for(char charachter : strArray){
            if(charCountMap.containsKey(charachter))
                charCountMap.put(charachter,charCountMap.get(charachter)+1);
            else
                charCountMap.put(charachter,1);

        }

        for(char character : strArray){
            if(charCountMap.get(character) == 1){
                System.out.println("First Non repeated character in String :: "+inputString+" is :: "+character);
                break;
            }
        }

        for(char character : strArray){
            if(charCountMap.get(character) > 1){
                System.out.println("First repeated character in String :: "+inputString+" is :: "+character);
                break;
            }
        }
    }
}
