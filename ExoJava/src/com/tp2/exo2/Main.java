package com.tp2.exo2;

public class Main {
    public static void main(String[] args) {
        Application application = new Application(5);
        application.add(0, "Maths", 12.0f);
        application.add(0, "Français", 3.0f);
        application.add(0, "C", 19.0f);
        application.add(0, "Java", 10.0f);

        application.add(1, "Maths", 0.0f);
        application.add(1, "Français", 0.0f);
        application.add(1, "C", 0.0f);
        application.add(1, "Java", 0.0f);
        application.add(1, "BDD", 20.0f);

        application.add(2, "Maths", 9.0f);
        application.add(2, "C", 13.0f);
        application.add(2, "Java", 14.0f);

        application.add(3, "Maths", 20.0f);
        application.add(3, "Français", 20.0f);
        application.add(3, "Java", 20.0f);

        application.add(4, "Maths", 10.0f);
        application.add(4, "Français", 10.0f);
        application.add(4, "Java", 10.0f);
        application.print();

        for (int i = 0; i < 5; i++) {
            System.out.println("Average of student " + i + " : " + application.average(i));
        }

        System.out.println("\nMax subjects in the class: " + application.compute() + "\n");


        System.out.println("Display Averages of each student with avgs function");
        float[] avgs = application.avgs();
        for (int i = 0; i < avgs.length; i++) {
            System.out.print("Student " + i + " : ");
            System.out.println(avgs[i]);
        }

    }
}
