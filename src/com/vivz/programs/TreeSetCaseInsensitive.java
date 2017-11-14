package com.vivz.programs;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by vivekdwivedi on 11/14/2017.
 */
public class TreeSetCaseInsensitive {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>(IGNORE_CASE);
        set.add("abc");
        set.add("Abc");
        set.add("def");
        set.add("Def");
        set.add("dEf");
        System.out.println(set);
    }

    static Comparator<String> IGNORE_CASE = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o1.compareToIgnoreCase(o2);
        }
    };
}
