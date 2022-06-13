package kyu8;

import static java.lang.Math.abs;

public class Number7 {
    //todo In this simple assignment you are given a number and have to make it negative.
    // But maybe the number is already negative?
    public static int makeNegative(final int x) {
        System.out.println(abs(x));


        return -abs(x);

    }

    public static void main(String[] args) {


        System.out.println(makeNegative(3));
    }
}
