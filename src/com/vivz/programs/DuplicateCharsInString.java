package com.vivz.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by vivekdwivedi on 9/21/2017.
 */
public class DuplicateCharsInString {
    public static void main(String[] args){
        duplicateCharCount("Java J2EE");
        duplicateCharCount("Bread Butter");
    }

    private static void duplicateCharCount(String inputString){
        Map<Character,Integer> charCountMap = new HashMap<>();

        char[] strArray = inputString.toCharArray();
        for(Character character : strArray){
            if(charCountMap.containsKey(character)){
                charCountMap.put(character,charCountMap.get(character)+1);
            }else{
                charCountMap.put(character,1);
            }
        }

        Set<Character> lCharacterSet = charCountMap.keySet();
        System.out.println("Duplicate Characters in String :: "+lCharacterSet);

        for(Character lCharacter : lCharacterSet){
            if(charCountMap.get(lCharacter) > 1){
                System.out.println(lCharacter+" : "+charCountMap.get(lCharacter));
            }
        }
    }
}
