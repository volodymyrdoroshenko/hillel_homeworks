package com.hillel.doroshenko.homeworks.homework5;

public class AckermannFunction {
    public static void main(String[] args) {
        int m = 4;
        int n = 1;
        System.out.print("A(" + m + ", " + n + ") = ");
        System.out.println(akkerman(m, n));
    }

    public static int akkerman(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if ((m > 0) && (n == 0)) {
            return akkerman(m - 1, 1);
        } else {
            return akkerman(m - 1, akkerman(m, n - 1));
        }
    }
}