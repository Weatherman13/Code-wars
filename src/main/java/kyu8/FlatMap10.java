package kyu8;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMap10 {
    public static void main(String[] args) {
        int[] ar1 = new int[]{1, 2, 3, 3};
        int[] ar2 = new int[]{4, 7, 6};
        int[] ar3 = new int[]{11, 15, 4, 9};
        int[] ar4 = new int[]{};
        int[][] megaArr = new int[][]{ar1, ar2, ar3, ar4};
        System.out.println(flattenAndSort(megaArr));

    }

    public static int[] flattenAndSort(int[][] array) {

        return Stream.of(array)
                .filter(it -> it.length>0)
                .flatMapToInt(IntStream::of)
                .sorted().toArray();
    }

}
