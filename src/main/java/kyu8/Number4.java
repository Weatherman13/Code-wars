package kyu8;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Number4 {
    //   todo In this kata you will create a function that takes a
    //    list of non-negative integers and strings and returns a new list with the strings filtered out.

    public static List filterList(final List list) {
        List<Integer> integers = new ArrayList<>();
        list.stream().forEach(b -> {
            if (b instanceof Integer) integers.add((Integer) b);
        });
        return integers;
    }

    public static void main(String[] args) {

        System.out.println(filterList(Arrays.asList(1, 2, "a", "b")));
    }
}
