package com.akash;
import java.util.Arrays;
import java.util.List;

public class Stream07MaxAndMinNumbers {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 3, 10, 20, 30, 15, 1, 13, 1, 2, 2, 10, 30, 40, 19, 3);
        Integer maxNum = list.stream().max((a, b) -> a - b).get();
        Integer minNum = list.stream().min((a, b) -> a - b).get();

        System.out.println("Max num :: "+maxNum);
        System.out.println("Min num :: "+minNum);

    }
}
