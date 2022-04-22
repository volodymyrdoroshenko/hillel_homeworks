package com.hillel.doroshenko.homeworks.homework9;

import java.util.Arrays;

public class Lottery {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 7;
        int[] array1 = new int[ARRAY_LENGTH];
        int[] array2 = new int[ARRAY_LENGTH];

        for (int i = 0; i < ARRAY_LENGTH; i++) {
            array1[i] = (int) (Math.random() * 10);
            array2[i] = (int) (Math.random() * 10);
        }

        Arrays.sort(array1);
        Arrays.sort(array2);

        int match = 0;
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            if (array1[i] == array2[i]) {
                match++;
            }
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println("Number of matches: " + match);
    }
}