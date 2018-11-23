package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        email();
        arrayLoop();
    }

    public static void email() {
        String email = "abc@esgi.fr";

        int arobaseIndex = email.indexOf('@');
        int dotIndex = email.indexOf('.');

        String name = email.substring(0, arobaseIndex);
        String domain = email.substring(arobaseIndex + 1, dotIndex);
        String end = email.substring(dotIndex + 1);

        System.out.println(name.toUpperCase());
        System.out.println(domain.toUpperCase());
        System.out.println(end.toUpperCase());
    }

    public static void arrayLoop() {
        double[] a = {10, 20, 30};
        double[] b = {40, 50, 60};
        System.out.print("Before Permutation: \na = ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("\nb = ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        double[] c;
        c = a;
        a = b;
        b = c;
        System.out.print("\nAfter Permutation: \na = ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("\nb = ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

        // Initialisation d'un tableau statique: Bien allouer l'espace mémoire pour chaque case
        StringBuilder[] sb = new StringBuilder[10];

        for (int i = 0; i < 10; i++) {
            sb[i] = new StringBuilder(Integer.toString(i));
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("sb[i] = " + sb[i]);
        }

        // Tableau dynamique

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(Integer.toString(i));
        }
    }
}
