package com.vivz.programs;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vivekdwivedi on 9/21/2017.
 */
public class EachCharCountInString {
    public static void main(String[] args){
        characterCount("Java J2EE Java JSP J2EE");
        characterCount("All is well");
        characterCount("Done is Gone");
    }

    private static void characterCount(String inputString){
        Map<Character, Integer> charCountMap = new HashMap<>();
        char[] strArray = inputString.toLowerCase().toCharArray();
        for(char character : strArray){
            if(charCountMap.containsKey(character)){
                charCountMap.put(character,charCountMap.get(character)+1);
            }else{
                charCountMap.put(character,1);
            }
        }

        System.out.println("Character Count Map :: "+charCountMap);
    }
}
