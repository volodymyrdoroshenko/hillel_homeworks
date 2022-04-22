package com.hillel.doroshenko.homeworks.homework2;

public class simpleArithmetic {
    public static void main(String[] args) {
        float a = 3.56f;
        float b = 1.87f;
        float c = 1.68f;
        float volume = a * b * c;
        System.out.println("Task 1\n" + "Объем параллелепипеда = " + volume);
        float length = (a + b + c) * 4;
        System.out.println("Сумма длин всех ребер параллелепипеда = " + length);

        double lat = 55.751667;
        double lon = 37.617778;
        System.out.println("\nTask 2\n" + "The main target of the Ukrainian Army is the Moscow Kremlin with coordinates: " + lat + "N, " + lon + "E");
    }
}