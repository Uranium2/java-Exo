package com.company;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Exo3 {
    public static void main(String[] args) throws IOException {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String alpha = sc1.nextLine();
        String str = sc2.nextLine();

        checkValidity(alpha, str);
        nRight(alpha, str, 2);
        nLeft(alpha, str, 2);
    }

    public static void checkValidity(String alpha, String str) {
        for (int i = 0; i < alpha.length(); i++) {
            int tmp = 0;
            for (int j = 0; j < str.length(); j++) {
                if (alpha.charAt(i) == str.charAt(j)) {
                    tmp++;
                    break;
                }
            }
            if (tmp == 0) {
                System.out.println("Not a valid char in alphabet");
                break;
            }
        }
    }

    public static void nRight(String alpha, String str, int n) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < alpha.length(); j++) {
                if (str.charAt(i) == alpha.charAt(j))
                {
                    if (j + n < alpha.length())
                        System.out.print(alpha.charAt(j + n));
                    else
                        System.out.print(alpha.charAt((j - alpha.length()) + n));
                }
            }
        }
        System.out.println();
    }
    public static void nLeft(String alpha, String str, int n) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < alpha.length(); j++) {
                if (str.charAt(i) == alpha.charAt(j))
                {
                    if (j - n >= 0)
                        System.out.print(alpha.charAt(j - n));
                    else
                        System.out.print(alpha.charAt((j + alpha.length()) - n));
                }
            }
        }
        System.out.println();
    }
}