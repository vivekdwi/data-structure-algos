package com.vivz.programs;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by vivekdwivedi on 9/22/2017.
 */
public class LongestSubString {
    public static void main(String[] args){
        longestSubstring("javaconceptoftheday");
        System.out.println("==========================");
        longestSubstring("thelongestsubstring");
    }

    private static void longestSubstring(String inputString){
        char[] strArray = inputString.toCharArray();
        String longestSubstring = null;
        int longestSubstringLength = 0;

        Map<Character,Integer> charPosMap = new LinkedHashMap<>();

        for(int i=0;i<strArray.length;i++){
            char character = strArray[i];

            if(!charPosMap.containsKey(character))
                charPosMap.put(character,i);
            else{
                i = charPosMap.get(character);
                charPosMap.clear();
            }

            if(charPosMap.size() > longestSubstringLength){
                longestSubstringLength = charPosMap.size();
                longestSubstring = charPosMap.keySet().toString();
            }
        }

        System.out.println("Input String :: "+inputString);
        System.out.println("Longest Sub String :: "+longestSubstring);
        System.out.println("Length of Longest Sub String :: "+longestSubstringLength);
    }
}
