package kyu8;

import java.util.Arrays;
import java.util.function.BiFunction;

public class Number14 {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> function = (a,b) -> a+b;
        function.apply(1,2);
        }

}
