package com.akash;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Stream10SecondLowestHighestNumber {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 10, 20, 30, 15, 1, 13, 1, 2, 2, 10, 40, 19, 3, 40);
        Integer secondLargest = list.stream().sorted((a, b) -> b - a).distinct().skip(1).findFirst().get();
        Integer secondLowest = list.stream().sorted().distinct().skip(1).findFirst().get();

        System.out.println(secondLargest);
        System.out.println(secondLowest);
    }
}
