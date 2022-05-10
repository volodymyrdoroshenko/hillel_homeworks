package com.hillel.doroshenko.homeworks.homework13;

public class MyArray {

    public double averageArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }

    public boolean checkSquareArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            if (array.length != array[i].length) {
                return false;
            }
        }
        return true;
    }
}