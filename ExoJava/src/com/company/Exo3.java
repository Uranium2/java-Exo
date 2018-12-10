package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Exo3 {
    public static void main(String[] args) throws IOException {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String alpha = sc1.nextLine();
        String str = sc2.nextLine();
    }

    public  void checkValidity(String alpha, String str){
        for (int i = 0; i < alpha.length(); i++) {
            int tmp = 0;
            for (int j = 0; j < str.length(); j++) {
                if (alpha.indexOf(i) == str.indexOf(j)) {
                    tmp = 1;
                    break;
                }
            }
            if (tmp == 0)
                System.out.println("Not a valid char in alphabet");
        }
    }
}