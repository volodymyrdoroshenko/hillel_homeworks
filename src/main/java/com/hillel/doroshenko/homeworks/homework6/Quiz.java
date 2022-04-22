package com.hillel.doroshenko.homeworks.homework6;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int answer;
        int restart;

        do {
            int mystery = (int) (Math.random() * 11);
            System.out.println("\nNew game!");
            System.out.println("Please, enter a digit from 0 to 10. You have 5 attempts.");
            for (int i = 5; i > 0; i--) {
                answer = getNumber(scanner);
                if (answer == mystery) {
                    System.out.println("You are the champion!");
                    break;
                } else if (i != 1) {
                    System.out.println("You didn't guess! Please, try again. You have " + (i - 1) + " attempts.");
                }
            }
            System.out.println("Game over! The mystery digit is " + mystery + ".");
            System.out.println("\nEnter any digit to restart game or enter \"1\" for exit?");
            restart = getNumber(scanner);
        } while (restart != 1);
    }

    public static int getNumber(Scanner scanner) {
        do {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Wrong data! Enter digit from 0 to 10!");
                scanner.next();
            }
        } while (true);
    }
}