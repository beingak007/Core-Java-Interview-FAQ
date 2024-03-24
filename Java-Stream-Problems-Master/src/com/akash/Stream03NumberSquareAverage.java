package com.akash;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream03NumberSquareAverage {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 10, 20, 30, 15);

        double avg = list.stream()
                         .map(i -> i * i)
                         .filter(e -> e > 100)
                         .mapToInt(e -> e)
                         .average()
                         .getAsDouble();

        System.out.println("The desired output :: "+avg);
    }
}
