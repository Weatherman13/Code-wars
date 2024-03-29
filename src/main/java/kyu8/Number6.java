package kyu8;

import java.util.Arrays;

public class Number6 {
//    todo Complete the square sum function so that
//     it squares each number passed into it and then sums the results together.
//     For example, for [1, 2, 2] it should return 9 because 1^2 + 2^2 + 2^2 = 9.

    public static int squareSum(int[] n)
    {
       return Arrays.stream(n).map(num -> num * num).sum();
    }

    public static void main(String[] args) {
        int []a = new int[]{1,2,5,2};
        System.out.println(squareSum(a));

    }
}
