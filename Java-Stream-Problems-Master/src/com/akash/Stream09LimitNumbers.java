package com.akash;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream09LimitNumbers {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 10, 20, 30, 15, 1, 13, 1, 2, 2, 10, 30, 19, 3);

        // get first 5 numbers -> sum of 5 numbers
        int sumOfFirstFive = list.stream().limit(5).reduce((a, b)->a+b).get();
        System.out.println("Sum of first 5 numbers :: "+sumOfFirstFive);

        // skip
        List<Integer> skip = list.stream().skip(5).collect(Collectors.toList());
        System.out.println("First 5 skipped :: "+skip);

        Integer sumSkip = list.stream().skip(5).reduce((a, b) -> a + b).get();
        System.out.println("Sum while skipping :: "+sumSkip);

    }
}
