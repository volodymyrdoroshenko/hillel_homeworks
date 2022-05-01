package com.hillel.doroshenko.homeworks.homework10;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        int restart = 0;
        while (restart != 2) {
            int[][] array = {
                    {2, 2, 2},
                    {2, 2, 2},
                    {2, 2, 2}
            };
            printArray(array);
            int count = 0;
            while (true) {
                setCellPerson(array);
                printArray(array);
                if (checkWin(array)) {
                    System.out.println("You are the champion!");
                    break;
                }
                if (count == 4) {
                    System.out.println("Draw in the game!");
                    break;
                }
                setCellComputer(array);
                printArray(array);
                if (checkWin(array)) {
                    System.out.println("Computer win! Do you still doubt the power of artificial intelligence?");
                    break;
                }
                count++;
            }
            restart = setRestart();
        }
    }

    public static void setCellPerson(int[][] array) {
        System.out.println("Choose cell from 1 to 9!");
        Scanner scan = new Scanner(System.in);
        int cell;
        while (true) {
            if (scan.hasNextInt()) {
                cell = scan.nextInt();
                if (cell > 0 && cell < 10 && checkEmptyCell(array, cell)) {
                    fillCell(array, cell, 1);
                    break;
                } else {
                    System.out.println("Wrong data! Enter digit from 1 to 9!");
                }
            } else {
                scan.next();
                System.out.println("Wrong data! Enter digit from 1 to 9!");
            }
        }
    }

    public static void setCellComputer(int[][] array) {
        while (true) {
            int cell = (int) (Math.random() * 10);
            if (checkEmptyCell(array, cell)) {
                fillCell(array, cell, 0);
                break;
            }
        }
    }

    public static boolean checkEmptyCell(int[][] array, int cell) {
        if (cell == 1 && array[0][0] == 2) return true;
        else if (cell == 2 && array[0][1] == 2) return true;
        else if (cell == 3 && array[0][2] == 2) return true;
        else if (cell == 4 && array[1][0] == 2) return true;
        else if (cell == 5 && array[1][1] == 2) return true;
        else if (cell == 6 && array[1][2] == 2) return true;
        else if (cell == 7 && array[2][0] == 2) return true;
        else if (cell == 8 && array[2][1] == 2) return true;
        else return cell == 9 && array[2][2] == 2;
    }

    //1 - person, fill "X", 0 - computer, fill "0"
    public static void fillCell(int[][] array, int a, int b) {
        int temp = 1;
        if (b == 0) {
            temp = 0;
        }
        switch (a) {
            case 1 -> array[0][0] = temp;
            case 2 -> array[0][1] = temp;
            case 3 -> array[0][2] = temp;
            case 4 -> array[1][0] = temp;
            case 5 -> array[1][1] = temp;
            case 6 -> array[1][2] = temp;
            case 7 -> array[2][0] = temp;
            case 8 -> array[2][1] = temp;
            case 9 -> array[2][2] = temp;
        }
    }

    public static void printArray(int[][] array) {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 0) {
                    System.out.print("0\t");
                } else if (array[i][j] == 1) {
                    System.out.print("X\t");
                } else {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean checkWin(int[][] array) {
        return (array[0][0] != 2 && array[0][0] == array[0][1] && array[0][0] == array[0][2]) ||
                (array[1][0] != 2 && array[1][0] == array[1][1] && array[1][0] == array[1][2]) ||
                (array[2][0] != 2 && array[2][0] == array[2][1] && array[2][0] == array[2][2]) ||
                (array[0][0] != 2 && array[0][0] == array[1][0] && array[0][0] == array[2][0]) ||
                (array[0][1] != 2 && array[0][1] == array[1][1] && array[0][1] == array[2][1]) ||
                (array[0][2] != 2 && array[0][2] == array[1][2] && array[0][2] == array[2][2]) ||
                (array[0][0] != 2 && array[0][0] == array[1][1] && array[0][0] == array[2][2]) ||
                (array[0][2] != 2 && array[0][2] == array[1][1] && array[0][2] == array[2][0]);
    }

    public static int setRestart() {
        System.out.println("\nDo you want to restart? 1 - yes, 2 - no");
        Scanner scan = new Scanner(System.in);
        int restart;
        while (true) {
            if (scan.hasNextInt()) {
                restart = scan.nextInt();
                if (restart == 1 || restart == 2) {
                    return restart;
                } else {
                    System.out.println("Wrong data! Do you want to restart? 1 - yes, 2 - no");
                }
            } else {
                scan.next();
                System.out.println("Wrong data! Do you want to restart? 1 - yes, 2 - no");
            }
        }
    }
}