package com.tp2;

public class Main {
    public static void main(String[] args) {
        Class1 class1 = new Class1(1);
        Class2 class2 = new Class2(2, 3, 4, 5);
        Class3 class3 = new Class3(2, 3, 4, 5, 6);
        Class4 class4 = new Class4(2, 3, 4, 5);
        Class5 class5 = new Class5();

        System.out.println(" Class2 a: " + class1.a + " Class1 b: " + ' ' + " Class2 c: " + ' ' + " Class2 d: " + ' ' + " Class2 e: " + ' ' + " Class2 f: " + ' ');
        System.out.println(" Class2 a: " + ' ' + " Class2 b: " + class2.b + " Class2 c: " + ' ' + " Class2 d: " + class2.d + " Class2 e: " + class2.e + " Class2 f: " + ' ');
        System.out.println(" Class3 a: " + ' ' + " Class3 b: " + class3.b + " Class3 c: " + ' ' + " Class3 d: " + class3.d + " Class3 e: " + class3.e + " Class3 f: " + class3.f);
        System.out.println(" Class4 a: " + ' ' + " Class4 b: " + class4.b + " Class4 c: " + ' ' + " Class4 d: " + class4.d + " Class4 e: " + class4.e + " Class4 f: " + ' ');
        System.out.println(" Class5 a: " + ' ' + " Class5 b: " + ' ' + " Class5 c: " + ' ' + " Class5 d: " + ' ' + " Class5 e: " + ' ' + " Class4 f: " + ' ');
    }

}