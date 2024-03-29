package com.stepic.findingAndMatching;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FirstWordWithoutPrefix {
    public static void printFirstWordWithoutPrefix(List<String> words, String prefix) {
        words.stream()
                .filter(word -> !word.startsWith(prefix))
                .findFirst()
                .ifPresent(System.out::println);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> words = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String prefix = scanner.nextLine();

        printFirstWordWithoutPrefix(words, prefix);
    }
}
