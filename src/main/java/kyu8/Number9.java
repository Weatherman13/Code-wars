package kyu8;

import org.springframework.boot.autoconfigure.amqp.RabbitProperties;

import java.util.Arrays;


public class Number9 {
    public static void main(String[] args) {


        System.out.println(accum("ZpglnRxqenU"));


    }

    public static String accum(String str) {
        StringBuilder result = new StringBuilder();
        char[] charArr = str.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            for (int b = 0; b <= i; b++) {
                if (b != 0) result.append(Character.toLowerCase(charArr[i]));
                else result.append(Character.toUpperCase(charArr[i]));
            }
            if (i != charArr.length - 1) result.append("-");
        }
        return result.toString();
    }
}
