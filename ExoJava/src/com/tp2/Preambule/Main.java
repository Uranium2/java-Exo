package com.tp2.Preambule;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /* PART 1 */
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


        /* PART 2 */
        /* A */
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        employeeArrayList.add(new Employee("Kevin", "Boudin", 13000.00, new Address(12, "Rue AZERTY")));
        employeeArrayList.add(new Employee("Paul", "Babouin", 13000.00, new Address(42, "Rue AZERTY")));
        employeeArrayList.add(new Employee("Jacque", "Bouda", 13000.00, new Address(52, "Rue AZERTY")));
        employeeArrayList.add(new Employee("Michel", "Bouboule", 13000.00, new Address(62, "Rue AZERTY")));
        employeeArrayList.add(new Employee("Jean", "Boudish", 13000.00, new Address(12, "Rue AZERTY")));
        employeeArrayList.add(new Employee("Richard", "Balour", 13000.00, new Address(22, "Rue AZERTY")));
        employeeArrayList.add(new Employee("Clement", "Blablacode", 13000.00, new Address(2, "Rue AZERTY")));

        Service service = new Service("Service des voisins", employeeArrayList);
        System.out.println("\nNew Service with only people from the same street\n");

        service.addEmployee(new Employee("Kalil", "Bensalek", 666666.00, new Address(2, "Rue QWERTY")));
        System.out.println("\nAdding a stranger in the Service\n");
        service.print();

        System.out.println("\nPeople see him and kill the stranger, thus removing him from the list\n");
        service.removeEmployee("Kalil");
        service.print();

        /* B */


        Person person1 = new Person("Toto", "Balou", 3, null, null, new ArrayList<Person>(), false);
        Person person2 = new Person("Tutu", "Balou", 30, null,null, new ArrayList<Person>(), true);
        Person person3 = new Person("Tata", "Balou", 28, null,null, new ArrayList<Person>(), false);

        person1.addMother(person3);
        person1.addFather(person2);

        // Dans l'implem de Person, on vérifie bien les conditions d'un pere/mere. Dès qu'on rajoute un parent ou un fils, on met a jour ses attributs pour ne pas avoir d'incohérence

        /* C */

        Student student1 = new Student("Jack", null);
        Student student2 = new Student("Jacki", null);
        Student student3 = new Student("Jacky", null);
        Student student4 = new Student("Jackouille", null);
        Student student5 = new Student("Jaquoille", null);

        Course course1 = new Course("Java", new ArrayList<>());
        Course course2 = new Course("Maths", new ArrayList<>());

        course1.addStudent(student1);
        course1.addStudent(student2);
        course1.addStudent(student3);
        course1.addStudent(student4);
        course1.addStudent(student5);

        course2.addStudent(student1);
        course2.addStudent(student2);
        course2.addStudent(student3);






    }

}