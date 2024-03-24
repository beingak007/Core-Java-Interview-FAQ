package com.akash;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream08SortNumbers {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0, 3, 10, 20, 30, 15, 1, 13, 1, 2, 2, 10, 40, 19, 3, 40);
        List<Integer> ascOrder = list.stream().sorted().collect(Collectors.toList());
        List<Integer> dscOrder = list.stream().sorted((a, b) -> b - a).collect(Collectors.toList());

        System.out.println("In ASC order :: "+ascOrder);
        System.out.println("In DSC order :: "+dscOrder);
    }
}
