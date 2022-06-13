package kyu8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Number12 {
    public static void main(String[] args) {
        int ar1 [] = {1, 1, 1, 10, 2, 10, 1, 12, 12};
        System.out.println(stray2(ar1));

    }

    public static int stray(int [] numbers) {
        Integer list [] = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        List<Integer> list2 = Arrays.stream(list).collect(Collectors.toList());
        List<Integer> result = list2.stream().filter(a -> Collections.frequency(list2,a)==1)
                .collect(Collectors.toList());
        return result.get(0);
    }


    public static int stray2 (int [] numbers){
        if (numbers[0] != numbers[1] && numbers[0] != numbers[2]) return numbers[0];
        for (int i : numbers) if (i != numbers[0]) return i;
        return 0;
    }
}
