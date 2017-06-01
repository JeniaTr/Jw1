package com.company;

import java.util.Scanner;

public class Main {

    public static int sum(int a, int b) {
        int x;
        x = a + b;
        return x;
    }

    public static double sum(double a, double b) {
        double x;
        x = a + b;
        return x;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("1 Masive");
        System.out.println("2 if || && ...");
        System.out.println("3 for while do ...");
        System.out.println("4 boolean");
        System.out.println("5 Metod");
        System.out.println("6 set get to class");
        System.out.println("7 Nasledovanie & overaid  ");

        System.out.println("Chose your number:");

        int num = in.nextInt();

        switch (num) {
            case 1:
                int[] a;
                int n;
                System.out.println("Enter number of array:");
                n = in.nextInt();
                a = new int[n];
                for (int i = 0; i < n; i++) {
                    System.out.print(" " + i + " ");
                    if (i % 10 == 0)
                        System.out.print("\n");
                }
                break;

            case 2:
                boolean isTrue = false;
                System.out.println("Enter first number (55):");
                int a1 = in.nextInt();
                System.out.println("Enter second number:");
                int b1 = in.nextInt();

                isTrue = a1 == 55;
                if (isTrue) {
                    System.out.println("first = 55 you aren't lucky");
                    System.out.println("Goodbye!!((");
                    break;
                }
                if (a1 > b1) System.out.println("first(" + a1 + ") < second(" + b1 + ")");
                else System.out.println("first(" + a1 + ") < second(" + b1 + ")");
                System.out.print("\n");

                if (a1 % 2 == 0) System.out.println(" Первое значение делится без остатка на 2");
                if (a1 > 3 && b1 > 3) System.out.println("a1 and b1 >3");
                if (a1 > 70 || b1 > 70) System.out.println("a1 or b1 >70");
                break;

            case 3:
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + " ");
                }

                System.out.print("\n");
                int i = 100;
                while (i > 10) {
                    i -= 10;
                    System.out.print(i + " ");
                }

                System.out.print("\n");
                int x = 1;
                do {
                    System.out.print(x + " ");
                } while (x < 1);
                break;

            case 4:
//                String a2 = ("Wow");
//                String b2 = ("Wow");
                // Objects
                String a2 = new String("Wow");
                String b2 = new String("Wow");

                float a3 = 33.33f;
                float b3 = 33.33f;

                String sameA = a2;

                boolean r1 = a2 == b2;      // Ложь, так как a и b не один и тот же объект
                boolean r2 = a2.equals(b2); // Истина, так как a и b логически равны
                boolean r3 = a2 == sameA;

                boolean r4 = a3 == b3;
                boolean r5 = a3 % b3 == 0;
                boolean r6 = a3 != b3;

                System.out.println(r1);
                System.out.println(r2);
                System.out.println(r3);

                System.out.println(r4);
                System.out.println(r5);
                System.out.println(r6);
                break;

            case 5:
                System.out.println("You will sum 2 arguments");
                System.out.println("Enter A: ");
//                int a4 = in.nextInt();
                double a4 = in.nextDouble();

                System.out.println("Enter B: ");
//                int b4 = in.nextInt();
                double b4 = in.nextDouble();

                System.out.println(sum(a4, b4));
                System.out.println(sum(444, 333));
                System.out.println(sum(3.34, 43.33));
                break;
            case 6:
                Student s = new Student();
                s.setInfo("Julia", "Petrivna", 33);
//              String name = s.getName();
                System.out.println("Name:" + s.getName() + "\nSerName:" + s.getSerName() + "\nAge:" + s.getAge());

                break;
            case 7:
                Advice a5 = new Advice();
                a5.message();

                Student s2 = new Student();
                s2.setName("Petro");

                StudentZao b5 = new StudentZao();
                System.out.println(b5.getName());
                break;

        }
    }
}
