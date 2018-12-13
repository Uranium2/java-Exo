package com.company;

import java.util.*;

public class Exo3 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        String alpha = sc1.nextLine();
        String str = sc1.nextLine();

        if (isValid(alpha, str))
            System.out.println("String is valid in the alphabet");
        else
            System.out.println("String is not valid in the alphabet");

        nRight(alpha, str, 2);
        nLeft(alpha, str, 2);

        if (isAnagram("abc", "bac"))
            System.out.println("Is Anagram");
        else
            System.out.println("Not Anagram");
        if (doesContains("ab", "rherwabrwo"))
            System.out.println("Does Contains");
        else
            System.out.println("Does not Contains");

    }

    public static boolean isValid(String alpha, String str) {
        for (int i = 0; i < alpha.length(); i++) {
            int tmp = 0;
            for (int j = 0; j < str.length(); j++) {
                if (alpha.charAt(i) == str.charAt(j)) {
                    tmp++;
                    break;
                }
            }
            if (tmp == 0) {
                return  false;
            }
        }
        return true;
    }

    public static void nRight(String alpha, String str, int n) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < alpha.length(); j++) {
                if (str.charAt(i) == alpha.charAt(j)) {
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
                if (str.charAt(i) == alpha.charAt(j)) {
                    if (j - n >= 0)
                        System.out.print(alpha.charAt(j - n));
                    else
                        System.out.print(alpha.charAt((j + alpha.length()) - n));
                }
            }
        }
        System.out.println();
    }

    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        char[] aList = a.toCharArray();
        char[] bList = b.toCharArray();

        Arrays.sort(aList);
        Arrays.sort(bList);

        if (Arrays.equals(aList, bList)) {
            return true;
        }
        return false;
    }

    public static boolean doesContains(String a, String b) {
        if (b.contains(a))
            return true;
        else
            return false;
    }
}