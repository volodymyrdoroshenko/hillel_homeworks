package com.hillel.doroshenko.homeworks.homework9;

import java.util.Arrays;

public class CocktailSort {
    public static void main(String[] args) {

        final int ARRAY_LENGTH = 10;
        int[] array = new int[ARRAY_LENGTH];

        for (int i = 0; i < ARRAY_LENGTH; i++) {
            array[i] = (int) (Math.random() * 50);
        }

        System.out.println(Arrays.toString(array));
        array = cocktailSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static int[] cocktailSort(int[] array) {
        int minIndex = 0;
        int maxIndex = array.length - 1;
        do {
            for (int i = minIndex; i < maxIndex; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            maxIndex--;
            for (int i = maxIndex; i > minIndex; i--) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
            minIndex++;
        } while (minIndex < maxIndex);
        return array;
    }
}