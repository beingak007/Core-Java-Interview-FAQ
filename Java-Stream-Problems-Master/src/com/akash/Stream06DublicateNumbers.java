package com.akash;
import java.util.*;
import java.util.stream.Collectors;

public class Stream06DublicateNumbers {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 3, 10, 20, 30, 15, 1, 2, 2, 10, 30, 19, 3);
        Set<Integer> dublicates = list.stream().filter(e -> Collections.frequency(list, e) > 1).collect(Collectors.toSet());
        System.out.println(dublicates);

        // another way
        HashSet<Integer> dubNum = new HashSet<>();
        Set<Integer> dublicates2 = list.stream().filter(e -> !dubNum.add(e)).collect(Collectors.toSet());
        System.out.println(dublicates2);
    }
}
