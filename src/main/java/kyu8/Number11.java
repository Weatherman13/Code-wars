package kyu8;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Number11 {
    public static void main(String[] args) {
    String str = "Stroka";
    String s = str.repeat(3);
        System.out.println(s);
    }

    public static Integer stray(Integer [] numbers){
        Stream.of(numbers).filter(a -> a<= 9).collect(Collectors.toList());
        return null;
    }
}
