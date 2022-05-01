package com.hillel.doroshenko.homeworks.homework10;

import java.util.Scanner;

public class MatrixTransposition {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Input m (from 1 to 10): ");
        int m = setSizeMatrix(scan);
        System.out.print("Input n (from 1 to 10): ");
        int n = setSizeMatrix(scan);

        int[][] array1 = new int[m][n];
        int[][] array2 = new int[n][m];

        fillMatrix(array1);
        fillMatrix(array2); // Not necessary

        matrixTransposition(array1, array2);

        printMatrix(array1);
        printMatrix(array2);
    }

    public static int setSizeMatrix(Scanner scan) {
        while (true) {
            if (scan.hasNextInt()) {
                int size = scan.nextInt();
                if (size >= 1 && size <= 10) {
                    return size;
                } else {
                    System.out.println("Wrong data! Enter digit from 1 to 10!");
                }
            } else {
                System.out.println("Wrong data! Enter digit from 1 to 10!");
                scan.next();
            }
        }
    }

    public static void fillMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public static void matrixTransposition(int[][] array1, int[][] array2) {
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = array1[j][i];
            }
        }
    }

    public static void printMatrix(int[][] array) {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}