package com.stepic;

public class TestCompareTo {
    @FunctionalInterface
    public interface TernaryIntPredicate {
        boolean test(Integer v1,Integer v2, Integer v3);
    }

    public static final TernaryIntPredicate allValuesAreDifferentPredicate = (v1,v2,v3) ->
    {if ((v1.compareTo(v2)==0) && (v2.compareTo(v3)==0) && (v1.compareTo(v3)==0)) return false;
    else return true;};

    public static void main(String[] args) {
        System.out.println( allValuesAreDifferentPredicate.test(1,1,1));
        System.out.println( allValuesAreDifferentPredicate.test(1,2,1));
        System.out.println( allValuesAreDifferentPredicate.test(1,1,2));
        System.out.println( allValuesAreDifferentPredicate.test(2,1,1));
        System.out.println( allValuesAreDifferentPredicate.test(1,2,3));
        System.out.println( allValuesAreDifferentPredicate.test(2,2,3));
        System.out.println( allValuesAreDifferentPredicate.test(3,2,3));
        System.out.println( allValuesAreDifferentPredicate.test(2,1,3));
        System.out.println( allValuesAreDifferentPredicate.test(1,2,1));
        System.out.println( allValuesAreDifferentPredicate.test(3,3,-15));
    }
}
