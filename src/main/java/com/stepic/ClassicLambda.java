package com.stepic;

import java.util.function.BiFunction;

public class ClassicLambda {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> function = (a, b) -> a+b;
        System.out.println(function.apply(1,2));
    }
}
