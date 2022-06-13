package com.stepic;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> sup = () -> "test";
        System.out.println(sup.get());
    }
}
