package com.hillel.doroshenko.homeworks.homework6;

public class SpaceShuttle {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 999; i++) {
            int a = i / 100;
            int b = (i % 100) / 10;
            int c = i % 10;
            if (division(a) && division(b) && division(c)) {
                System.out.println(i + " (total " + ++count + ")");
            }
            if (count == 100) {
                System.exit(0);
            }
        }
    }

    public static boolean division(int i) {
        if (i == 0 || ((i % 4 != 0 || i % 8 == 0) && (i % 9 != 0))) {
            return true;
        } else return false;
    }
}