package kyu8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Number1 {
//    todo Take 2 strings s1 and s2 including only letters from ato z.
//     Return a new sorted string, the longest possible,
//     containing distinct letters - each taken only once - coming from s1 or s2.

    public static String longest (String s1, String s2) {
       StringBuilder stringBuilder = new StringBuilder();
       (s1+s2).chars().sorted().distinct().forEach(a -> stringBuilder.append((char)a));
        return stringBuilder.toString();
    }


//    todo Check
    public static void main(String[] args) {
        var s1 = "zaad sssggggggg zzzzz zdd";
        var s2 = "fffffff";

        List<String> list = Arrays.asList(s1.split(" "));
        System.out.println(list);




//        list.stream().sorted().forEach(System.out::println);





//        System.out.println(longest(s1,s2));
//        Thread current = Thread.currentThread();
//        StackTraceElement[] methods = current.getStackTrace();
//        Arrays.stream(methods).forEach(a -> System.out.println(a));

//        Arrays.stream(stringBuilder.chars().toArray()).forEach(a -> System.out.println(a));


    }
}
