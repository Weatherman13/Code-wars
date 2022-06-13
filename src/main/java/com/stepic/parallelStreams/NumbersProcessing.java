package com.stepic.parallelStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NumbersProcessing {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Arrays.stream(scanner.nextLine().split("\\s+"))
//                .map(Integer::parseInt)
//                .sorted()
//                .map(n -> n * 2)
//                .forEachOrdered(System.out::println);

        int result2 = List.of(1, 2, 3, 4, 5).stream().reduce(100, Integer::sum);
        System.out.println(result2);
    }
}
