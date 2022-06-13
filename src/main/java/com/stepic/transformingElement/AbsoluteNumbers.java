package com.stepic.transformingElement;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AbsoluteNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String result = Arrays.stream(scanner.nextLine().split("\\s+")) // Stream<String>
                .map(Integer::parseInt)
                .map(num -> Math.abs(num))
                .map(num -> num.toString())
                .collect(Collectors.joining(" "));

        System.out.println(result);
    }
}
