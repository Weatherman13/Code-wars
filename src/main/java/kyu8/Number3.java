package kyu8;

public class Number3 {
//    todo We need a function that can transform a number into a string.
//     What ways of achieving this do you know?

    public static String numberToString(int num) {

        return Integer.valueOf(num).toString();
    }

    public static void main(String[] args) {
        System.out.println(numberToString(12));
    }
}
