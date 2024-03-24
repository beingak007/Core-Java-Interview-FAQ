package com.akash;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stream12DublicateElementFromAString {

    public static void main(String[] args) {

        String input = "ilovejavatechie";
        List<String> list = Arrays.asList(input.split(""));
        List<String> collect = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(a -> a.getValue() > 1)
                .map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(collect);

        //Output: [a, e, v, i]
    }
}
