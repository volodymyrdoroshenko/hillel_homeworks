package com.hillel.doroshenko.homeworks.homework7;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] source = {1, 5, 8, 7, 9, 15, 47, 58};
        int[] target = {7, 8, 9, 5, 6, 7, 57};
        System.out.println("Source: " + Arrays.toString(source));
        System.out.println("Target: " + Arrays.toString(target));
        target = arrayCopy(source, target);
        System.out.println("Target (extended): " + Arrays.toString(target));
    }

    public static int[] arrayCopy(int[] source, int[] target) {
        int sumLength = source.length + target.length;
        int[] result = new int[sumLength];
        if (target.length == 0) {
            for (int i = 0; i < sumLength; i++) {
                result[i] = source[i];
            }
        } else {
            for (int i = 0; i < sumLength; i++) {
                if (i < target.length) {
                    result[i] = target[i];
                } else {
                    result[i] = source[i - target.length];
                }
            }
        }
        return result;
    }
}