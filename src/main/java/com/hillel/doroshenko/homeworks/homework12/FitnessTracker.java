package com.hillel.doroshenko.homeworks.homework12;

public class FitnessTracker {
    public static void main(String[] args) {

        Athlete athlete1 = new Athlete("Ivan", 25, 05, 1996,
                "123@hillel.com", "+380971111111", "Ivanov",
                95, 120, 3500);

        Athlete athlete2 = new Athlete("Oleg", 12, 07, 1985,
                "345@hillel.com", "+380972222222", "Petrov",
                85, 130, 2500);

        Athlete athlete3 = new Athlete("Sergey", 25, 05, 1996,
                "678@hillel.com", "+3809733333331", "Sidorov",
                60, 115, 13500);

        athlete1.printAccountInfo();
        athlete2.printAccountInfo();
        athlete3.printAccountInfo();

        athlete1.setSurname("Doroshenko");
        athlete1.setWeight(85);
        athlete1.setStepsPerDay(4800);

        athlete3.setWeight(65);
        athlete3.setPressure(125);
        athlete3.setStepsPerDay(9600);

        athlete1.printAccountInfo();
        athlete2.printAccountInfo();
        athlete3.printAccountInfo();
    }
}