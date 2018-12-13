package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Exo2 {
    public static void main(String[] args) {
        BufferedReader reader;
        ArrayList<Integer> results = new ArrayList<>();
        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\Tavernier\\Documents\\Cours\\JAVA\\projets\\ExoJava\\src\\com\\company\\sample.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                Integer score = Integer.parseInt(line.substring(line.indexOf(":") + 1));
                results.add(score);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Cannot read line");
            sou
        }
        int res = sumAll(results);
        System.out.printf("Average score is: " + res);
    }

    public static Integer sumAll(ArrayList<Integer> arr) {
        int res = 0;
        for (int i = 0; i < arr.size(); i++) {
            res += arr.get(i);
        }
        return res;
    }

    public static ArrayList<String> getEmails() {
        BufferedReader reader ;
        ArrayList<String> emails = new ArrayList<>();
        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\Tavernier\\Documents\\Cours\\JAVA\\projets\\ExoJava\\src\\com\\company\\sample.txt"));

            String line;
            while ((line = reader.readLine()) != null) {
                String email = line.substring(0, line.indexOf(":"));
                emails.add(email);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Cannot read line");
        }
        return emails;
    }
}
