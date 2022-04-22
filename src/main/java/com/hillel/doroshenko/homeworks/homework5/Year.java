package com.hillel.doroshenko.homeworks.homework5;

import java.util.Scanner;

public class Year {
    public static void main(String[] args) {

        int year = 0;
        System.out.println("Input year: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            year = scanner.nextInt();
        } else {
            System.out.println("Wrong data");
            System.exit(0);
        }
        scanner.close();

        if (checkLeapYear(year)) {
            System.out.println("The year " + year + " is a leap year");
        } else {
            System.out.println("The year " + year + " is not a leap year");
        }
    }

    public static boolean checkLeapYear(int year) {
        boolean result;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}