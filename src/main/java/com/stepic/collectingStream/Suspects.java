package com.stepic.collectingStream;

import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Suspects {

    public static List<String> reduceSuspects(List<String> suspects) {
        return suspects.stream().filter(suspect -> suspect.contains("jo")).sorted().collect(Collectors.toList()); // write your code here
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> suspects = Stream
                .iterate(1, i -> scanner.hasNextLine(), i -> i + 1)
                .map(i -> scanner.nextLine())
                .collect(Collectors.toList());
        

        reduceSuspects(suspects)
                .forEach(System.out::println);
    }
}
