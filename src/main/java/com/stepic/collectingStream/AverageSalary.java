package com.stepic.collectingStream;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AverageSalary {
    public static double averageSalary(List<Employee> employees) {
        if (employees.isEmpty()) return 0;
        return employees.stream().collect(Collectors.averagingDouble(Employee::getSalary));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Employee> employees = Stream
                .iterate(1, i -> scanner.hasNextLine(), i -> i + 1)
                .map(i -> scanner.nextLine().split("\\s+"))
                .map(parts -> new Employee(parts[0], Long.parseLong(parts[1])))
                .collect(Collectors.toList());

        System.out.println(averageSalary(employees));
    }
}

class Employee {
    private final String name;
    private final long salary;

    public Employee(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }
}
