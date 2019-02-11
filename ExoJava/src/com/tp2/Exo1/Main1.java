package com.tp2.Exo1;

public class Main1 {
    public static void main(String[] args) {
        // Init && print
        De de = new De(1, 6);
        de.print();

        // Roll && print
        //de.throwMe();
        //de.print();

        de.throwNb(Integer.parseInt(args[0]) - 1);
    }
}
