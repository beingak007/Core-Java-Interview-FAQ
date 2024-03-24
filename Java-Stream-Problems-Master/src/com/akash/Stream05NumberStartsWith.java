package com.akash;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream05NumberStartsWith {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 220, 234, 567, 890, 432, 234, 211, 22);
        List<Integer> startsWith2 = numbers.stream()
                                           .map(e -> String.valueOf(e))
                                           .filter(e -> e.startsWith("2"))
                                           .map(Integer::valueOf)
                                           .collect(Collectors.toList());
        System.out.println("Numbers starting with 2 :: "+startsWith2);
    }
}
