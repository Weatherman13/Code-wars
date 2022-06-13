package com.stepic;

import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> cons = a -> System.out.println(a);
        cons.accept("Test");

        Supplier<LocalDate> todaySupplier = LocalDate::now;
        System.out.println(todaySupplier.get());
    }
}
