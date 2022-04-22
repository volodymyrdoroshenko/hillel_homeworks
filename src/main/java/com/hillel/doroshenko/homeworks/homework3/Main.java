package com.hillel.doroshenko.homeworks.homework3;

public class Main {
    public static void main(String[] args) {
        short numberVoinLi = 860;
        short numberLuchnikLi = 860;
        short numberVsadnikLi = 860;
        short numberVoinMin = (short) (numberVoinLi * 1.5);
        short numberLuchnikMin = (short) (numberLuchnikLi * 1.5);
        short numberVsadnikMin = (short) (numberVsadnikLi * 1.5);

        int sumAttackLi = numberVoinLi * 13 + numberLuchnikLi * 24 + numberVsadnikLi * 46;
        int sumAttackMin = numberVoinMin * 9 + numberLuchnikMin * 35 + numberVsadnikMin * 12;

        System.out.println("Task 1");
        System.out.println("Li army total attack = " + sumAttackLi);
        System.out.println("Min' army total attack = " + sumAttackMin);

        division();

        int n = 50;
        random(n);
    }

    public static void division() {
        int a = 65;
        int b = 32;
        System.out.println("\nTask 2");
        System.out.println("a / b = " + (float) a / b);
    }

    public static void random(int n) {
        int rand = (int) (Math.random() * (n * 2 + 1)) - n;
        System.out.println("\nTask 3");
        System.out.println("Random number in the range from -" + n + " to + " + n + ": " + rand);
    }
}