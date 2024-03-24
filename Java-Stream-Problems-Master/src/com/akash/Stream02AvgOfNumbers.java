package com.akash;
import java.util.Arrays;
import java.util.List;

public class Stream02AvgOfNumbers {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 33, 44, 22, 12, 34, 0);
        double average = list.stream().mapToInt(e -> e).average().getAsDouble();
        System.out.println("Average of numbers :: "+average);

    }
}