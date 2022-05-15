package com.hillel.doroshenko.homeworks.homework14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
                    DrinksPrepare.prepareCoffee();
                    countCoffee++;
                    countTotalSum += Drinks.COFFEE_PRICE;
                    break;
                case TEA:
                    DrinksPrepare.prepareTea();
                    countTea++;
                    countTotalSum += Drinks.TEA_PRICE;
                    break;
                case LEMONADE:
                    DrinksPrepare.prepareLemonade();
                    countLemonade++;
                    countTotalSum += Drinks.LEMONADE_PRICE;
                    break;
                case MOJITO:
                    DrinksPrepare.prepareMojito();
                    countMojito++;
                    countTotalSum += Drinks.MOJITO_PRICE;
                    break;
                case WATER:
                    DrinksPrepare.prepareWater();
                    countWater++;
                    countTotalSum += Drinks.WATER_PRICE;
                    break;
                case COKE:
                    DrinksPrepare.prepareCoke();
                    countCoke++;
                    countTotalSum += Drinks.COKE_PRICE;
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