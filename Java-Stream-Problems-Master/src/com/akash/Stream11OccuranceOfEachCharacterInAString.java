package com.akash;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stream11OccuranceOfEachCharacterInAString {
    public static void main(String[] args) {

        String input = "ilovejavatechie";
        List<String> list = Arrays.asList(input.split(""));
        Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

        // Output: {a=2, c=1, t=1, e=3, v=2, h=1, i=2, j=1, l=1, o=1}

    }
}
