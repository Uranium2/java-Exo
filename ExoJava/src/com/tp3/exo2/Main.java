package com.tp3.exo2;

public class Main {
    public static void main(String[] args) {
        Employee[] arr = new Employee[10];
        arr[0] = new CDI("Jhon0", 1000.99f);
        arr[1] = new CDD("Jhon1", 1000.99f);
        arr[2] = new CDI("Jhon2", 1000.99f);
        arr[3] = new CDD("Jhon3", 1000.99f);
        arr[4] = new CDI("Jhon4", 1000.99f);
        arr[5] = new CDD("Jhon5", 1000.99f);
        arr[6] = new CDI("Jhon6", 1000.99f);
        arr[7] = new CDD("Jhon7", 1000.99f);
        arr[8] = new CDI("Jhon8", 1000.99f);
        arr[9] = new CDD("Jhon9", 1000.99f);

        float sum = 0f;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getSalary();
        }
        System.out.println("Total Salary :" + sum);
        }
        int[] array;
        public static void apply(int[] arr, Compute com){
            
        }
}

