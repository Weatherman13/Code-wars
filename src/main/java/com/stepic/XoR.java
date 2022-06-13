package com.stepic;

import java.util.function.Predicate;

public class XoR {
    public static <T> Predicate<T> xor(Predicate<T> predicate1, Predicate<T> predicate2) {
        Predicate predicate = a -> (predicate1.or(predicate2).test((T) a)) && (predicate1.and(predicate2).negate().test((T) a)) ;

        return predicate;
    }
}
