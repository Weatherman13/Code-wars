package com.stepic.primetiveTypeStreams;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Isogram {
    public static boolean isIsogram(String word) {
        return word
                .chars()
                .distinct()
                .toArray()
                .length == word.toCharArray().length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        System.out.println(isIsogram(word));
    }
}
