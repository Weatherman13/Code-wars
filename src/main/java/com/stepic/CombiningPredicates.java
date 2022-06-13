package com.stepic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;

class CombiningPredicates {

    /**
     * The method represents the conjunction operator for a list of predicates.
     * For an empty list it returns the always true predicate.
     */
    public static IntPredicate conjunctAll(List<IntPredicate> predicates) {
        IntPredicate allAnd = a -> {
            if (predicates.isEmpty()) return true;
            for (int i=0; i< predicates.size()-1; i++){
                if (predicates.get(i).and(predicates.get(i+1)).test(a));
                else return false;
            }
            return true;
        };
        return allAnd;
    }

    // Don't change the code below
    public static void main(String[] args) {
        IntPredicate predicate1 = a -> a % 2 == 0;
        IntPredicate predicate2 = a -> a % 3 == 0;
        IntPredicate predicate3 = a -> a == 12;

        List<IntPredicate> predicates = new ArrayList<>();
//        predicates.add(predicate1);
//        predicates.add(predicate3);
//        predicates.add(predicate2);

        System.out.println(conjunctAll(predicates).test(24));


    }
}
