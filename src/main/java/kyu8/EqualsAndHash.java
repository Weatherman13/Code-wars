package kyu8;

import com.example.tasks_from_code_wars.Person;

import java.util.Arrays;

// TODO: You are given an array(list) strarr of strings and an integer k.
//  Your task is to return the first longest string consisting of k consecutive strings taken in the array.
public class EqualsAndHash {

    final static Person a = new Person(20,"Dmitry", 72 );
    final static Person b = new Person(20,"Dmitry", 72);

    public static void main(String[] args) {
        System.out.println(a.equals(b));
        System.out.println(a.hashCode() + "| |" +b.hashCode());
    }
}
