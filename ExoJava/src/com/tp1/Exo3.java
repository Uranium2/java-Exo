package com.tp1;

import java.util.ArrayList;
import java.util.Scanner;

public class Exo3 {
    public static void main(String[] args) throws ArithmeticException{
        Scanner sc1 = new Scanner(System.in);
        String in = sc1.nextLine();
        ArrayList<Character> list = new ArrayList<>();
        for (char c: in.toCharArray()) {
            list.add(c);
        }
        try {
            System.out.println(getSumThrow(list));
        }catch (ArithmeticException e)
        {
            e.printStackTrace();
        }
        System.out.println(getSum(list));
    }

    public static Integer getSum(ArrayList<Character> list){
        if (list == null ||list.isEmpty())
            return 0;

        int i = 0;
        int sum = 0;
        for (char c: list) {
            if (!Character.isAlphabetic(c)) {
                i++;
                sum += Character.getNumericValue(c);
            }
            else {
                throw new ArithmeticException("not an integer1");
            }
        }
        return sum / i;
    }

    public static Integer getSumThrow(ArrayList<Character> list) throws ArithmeticException{
        if (list == null ||list.isEmpty())
            return 0;

        int i = 0;
        int sum = 0;
        for (char c: list) {
            if (!Character.isAlphabetic(c)) {
                i++;
                sum += Character.getNumericValue(c);
            }
            else {
                throw new ArithmeticException("not an integer2");
            }
        }
        return sum / i;
    }
}
