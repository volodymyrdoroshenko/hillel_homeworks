package com.hillel.doroshenko.homeworks.homework14;

import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        final int COFFEE_PRICE = 20;
        final int TEA_PRICE = 15;
        final int LEMONADE_PRICE = 25;
        final int MOJITO_PRICE = 30;
        final int WATER_PRICE = 10;
        final int COKE_PRICE = 23;

        int countCoffee = 0;
        int countTea = 0;
        int countLemonade = 0;
        int countMojito = 0;
        int countWater = 0;
        int countCoke = 0;
        int countTotalSum = 0;
        int restart = 0;

        while (restart != 2) {
            DrinksMachine drinksType = userChoose();

            switch (drinksType) {
                case COFFEE:
                    prepareCoffee();
                    countCoffee++;
                    countTotalSum += COFFEE_PRICE;
                    break;
                case TEA:
                    prepareTea();
                    countTea++;
                    countTotalSum += TEA_PRICE;
                    break;
                case LEMONADE:
                    prepareLemonade();
                    countLemonade++;
                    countTotalSum += LEMONADE_PRICE;
                    break;
                case MOJITO:
                    prepareMojito();
                    countMojito++;
                    countTotalSum += MOJITO_PRICE;
                    break;
                case WATER:
                    prepareWater();
                    countWater++;
                    countTotalSum += WATER_PRICE;
                    break;
                case COKE:
                    prepareCoke();
                    countCoke++;
                    countTotalSum += COKE_PRICE;
                    break;
            }
            System.out.print("Total drinks: " + (countCoffee + countTea + countLemonade + countMojito + countWater + countCoke));
            System.out.println(" (coffee - " + countCoffee + ", tea - " + countTea + ", lemonade - " + countLemonade
                    + ", mojito - " + countMojito + ", water - " + countWater + ", coke - " + countCoke + ")");
            System.out.println("Total sum: " + countTotalSum);
            restart = setRestart();
        }
    }

    public static DrinksMachine userChoose() {
        DrinksMachine drinksType;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String str;
            System.out.println("Please, type drink's name (coffee, tea, lemonade, mojito, water, coke)");
            str = scanner.next();
            str = str.toUpperCase();
            try {
                drinksType = DrinksMachine.valueOf(str);
                break;
            } catch (IllegalArgumentException e) {
            }
        }
        return drinksType;
    }

    public static void prepareCoffee() {
        System.out.println("Please, wait. Coffee is preparing...");
    }

    public static void prepareTea() {
        System.out.println("Please, wait. Tea is preparing...");
    }

    public static void prepareLemonade() {
        System.out.println("Please, wait. Lemonade is preparing...");
    }

    public static void prepareMojito() {
        System.out.println("Please, wait. Mojito is preparing...");
    }

    public static void prepareWater() {
        System.out.println("Please, wait. Mineral water is preparing...");
    }

    public static void prepareCoke() {
        System.out.println("Please, wait. Coke is preparing...");
    }

    public static int setRestart() {
        System.out.println("Do you want to add another drink (1 - yes, 2 - no)?");
        Scanner scan = new Scanner(System.in);
        int restart;
        while (true) {
            if (scan.hasNextInt()) {
                restart = scan.nextInt();
                if (restart == 1 || restart == 2) {
                    return restart;
                } else {
                    System.out.println("Wrong data! Do you want to add another drink (1 - yes, 2 - no)?");
                }
            } else {
                scan.next();
                System.out.println("Wrong data! Do you want to add another drink (1 - yes, 2 - no)?");
            }
        }
    }
}