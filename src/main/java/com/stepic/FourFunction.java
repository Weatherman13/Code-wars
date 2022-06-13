package com.stepic;
@FunctionalInterface
public interface FourFunction <R,T1,T2,T3>{
    R apply(T1 val1,T2 val2,T3 val3);
}



