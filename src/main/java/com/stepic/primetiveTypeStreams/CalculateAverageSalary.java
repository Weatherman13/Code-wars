package com.stepic.primetiveTypeStreams;

import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class CalculateAverageSalary {
    private static double calcAverageSalary(Collection<Integer> salaries) {
        return salaries.stream().mapToDouble(a -> a).average().getAsDouble();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> salaries = scanner.tokens()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println(calcAverageSalary(salaries));
    }
}
