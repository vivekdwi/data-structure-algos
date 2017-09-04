package com.vivz.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by vivekdwivedi on 9/4/2017.
 */
public class StreamExample {
    public static void main(String[] args){
        List<String> lStringArrayList = new ArrayList<>();
        lStringArrayList.add("ddd2");
        lStringArrayList.add("aaa2");
        lStringArrayList.add("bbb1");
        lStringArrayList.add("aaa1");
        lStringArrayList.add("bbb3");
        lStringArrayList.add("ccc");
        lStringArrayList.add("bbb2");
        lStringArrayList.add("ddd1");

        lStringArrayList
                .stream()
                .filter((s) -> s.startsWith("a"))
                .forEach(System.out :: println);

        lStringArrayList
                .stream()
                .sorted()
                .filter((s) -> s.startsWith("a"))
                .forEach(System.out :: println);

        lStringArrayList
                .stream()
                .map(String::toUpperCase)
                .sorted((a, b) -> b.compareTo(a))
                .forEach(System.out::println);

        boolean anyStartsWithA = lStringArrayList
                .stream()
                .anyMatch((s) -> s.startsWith("a"));

        System.out.println(anyStartsWithA);

        boolean allStartsWithA = lStringArrayList
                .stream()
                .allMatch((s) -> s.startsWith("a"));
        System.out.println(allStartsWithA);

        boolean noneStartsWithZ = lStringArrayList
                .stream()
                .noneMatch((s) -> s.startsWith("z"));
        System.out.println(noneStartsWithZ);

        long startsWithB = lStringArrayList
                .stream()
                .filter((s) -> s.startsWith("b"))
                .count();
        System.out.println(startsWithB);

        Optional<String> reduced =
                lStringArrayList
                        .stream()
                        .sorted()
                        .reduce((s1, s2) -> s1 + "#" + s2);
        reduced.ifPresent(System.out::println);
    }
}
