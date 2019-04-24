package com.tp3.exo2;

public interface Greater<T> extends Comparable<T>{
    default boolean isL(T t) {
        return compareTo(t) < 0;
    }
    default  boolean isGE(T t) {
        return !isL(t);
    }
    //
    // ...
    //
}
