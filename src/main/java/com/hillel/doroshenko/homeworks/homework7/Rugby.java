package com.hillel.doroshenko.homeworks.homework7;

import java.util.Arrays;

public class Rugby {
    public static void main(String[] args) {
        int[] team1 = new int[25];
        int[] team2 = new int[25];
        int ageMin = 18;
        int ageMax = 40;
        int sumAgeTeam1 = 0;
        int sumAgeTeam2 = 0;

        for (int i = 0; i < 25; i++) {
            team1[i] = ageMin + (int) (Math.random() * ((ageMax - ageMin) + 1));
            team2[i] = ageMin + (int) (Math.random() * ((ageMax - ageMin) + 1));
            sumAgeTeam1 += team1[i];
            sumAgeTeam2 += team2[i];
        }
        System.out.println(Arrays.toString(team1));
        System.out.println(Arrays.toString(team2));
        System.out.println("Average age Team1 is " + (sumAgeTeam1 / 25) + " years");
        System.out.println("Average age Team2 is " + (sumAgeTeam2 / 25) + " years");
    }
}