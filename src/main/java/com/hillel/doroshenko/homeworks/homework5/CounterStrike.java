package com.hillel.doroshenko.homeworks.homework5;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first team name: ");
        String team1 = getTeamName(scan);
        System.out.println("Enter the second team name: ");
        String team2 = getTeamName(scan);

        System.out.println("Enter frags for " + team1 + " players");
        int team1player1 = getFragsNumber(scan);
        int team1player2 = getFragsNumber(scan);
        int team1player3 = getFragsNumber(scan);
        int team1player4 = getFragsNumber(scan);
        int team1player5 = getFragsNumber(scan);
        System.out.println("Enter frags for " + team2 + " players");
        int team2player1 = getFragsNumber(scan);
        int team2player2 = getFragsNumber(scan);
        int team2player3 = getFragsNumber(scan);
        int team2player4 = getFragsNumber(scan);
        int team2player5 = getFragsNumber(scan);
        scan.close();

        double team1average = (double) (team1player1 + team1player2 + team1player3 + team1player4 + team1player5) / 5;
        double team2average = (double) (team2player1 + team2player2 + team2player3 + team2player4 + team2player5) / 5;
        System.out.println("Team " + team1 + " average frags = " + team1average);
        System.out.println("Team " + team2 + " average frags = " + team2average);

        if (team1average > team2average) {
            System.out.println(team1 + " team won with result " + team1average);
        } else if (team1average < team2average) {
            System.out.println(team2 + " team won with result " + team2average);
        } else {
            System.out.println("There is no winner. Draw in the game.");
        }
    }

    public static String getTeamName(Scanner scan) {
        String teamName = scan.nextLine();
        return teamName;
    }

    public static int getFragsNumber(Scanner scan) {
        int frags = 0;
        if (scan.hasNextInt()) {
            frags = scan.nextInt();
        } else {
            System.out.println("Entered data is wrong!");
            System.exit(0);
        }
        return frags;
    }
}