package com.vivz.programs;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by vivekdwivedi on 9/22/2017.
 */
public class TreeMapSortByValues {
    public static void main(String[] args){
        Map<String,Integer> map = new TreeMap<String,Integer>();
        map.put("vivek", 30);
        map.put("abhishek", 12);
        map.put("manoj", 100);
        System.out.println(map);
        System.out.println(sortByValues(map));
    }

    private static <K, V extends Comparable<V>>Map<K,V> sortByValues(final Map<K,V> map){
        Comparator<K> valueComparator = new Comparator<K>() {
            @Override
            public int compare(K o1, K o2) {
                int compare = map.get(o2).compareTo(map.get(o1));
                if(compare == 0)
                    return 1;
                return compare;
            }
        };
         Map<K,V> sortedByValues = new TreeMap<K,V>(valueComparator);
         sortedByValues.putAll(map);
         return sortedByValues;
    }
}
