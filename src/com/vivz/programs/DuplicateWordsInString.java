package com.vivz.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by vivekdwivedi on 9/21/2017.
 */
public class DuplicateWordsInString {

    public static void main(String[] args){
        duplicateWords("Hi this is vivek");
        duplicateWords("Bread butter and bread");
        duplicateWords("Java is java again java");
        duplicateWords("super man bat man spider man");
    }

    private static void duplicateWords(String inputString){
        String[] words = inputString.split(" ");
        Map<String, Integer> wordCount = new HashMap<>();

        for(String word : words){
            if(wordCount.containsKey(word)){
                wordCount.put(word.toLowerCase(),wordCount.get(word.toLowerCase())+1);
            }else {
                wordCount.put(word.toLowerCase(),1);
            }
        }

        Set<String> wordSet = wordCount.keySet();

        for (String word : wordSet){
            if(wordCount.get(word) >1)
                System.out.println(word+" "+wordCount.get(word));
        }
    }
}
