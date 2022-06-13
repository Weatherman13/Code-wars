package kyu8;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;

import java.security.AlgorithmConstraints;
import java.security.AlgorithmParameterGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Number5 {
//    todo The goal of this exercise is to convert a string to a new string where each character
//     in the new string is "(" if that character appears only once in the original string,
//     or ")" if that character appears more than once in the original string.
//     Ignore capitalization when determining if a character is a duplicate.

//    word = word.toLowerCase();
//    String result = "";
//    for (int i = 0; i < word.length(); ++i) {
//        char c = word.charAt(i);
//        result += word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")";
//    }
//    return result;


    static String encode(String word) {
        return word;
    }


    public static void main(String[] args) {
//        StringBuilder builder = new StringBuilder();
//        String time = null;
//        var k = 0;
//
//        String string = "asdd";
//        List<String> list = new ArrayList<>();
//        Arrays.stream(string.chars().sorted().toArray()).forEach(a -> {
//            list.add(String.valueOf((char)a));
//        });
//        for (int i = 0; i < list.size(); i++){
//            if (i == list.size()){
//                if (list.get(i).equals(list.get(i-1))) time = time + "(";
//            }
//            if (list.get(i).equals(list.get(i+1))) time = time + "(";
//            time = time + ")";
//        }
        
//        System.out.println(time);

        Arrays.stream(Role.values()).forEach(s -> System.out.println(s));
    }
}
