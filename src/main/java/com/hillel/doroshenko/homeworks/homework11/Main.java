package com.hillel.doroshenko.homeworks.homework11;

public class Main {
    public static void main(String[] args) {
        Employee[] array = new Employee[5];

        //Avoiding "Null Pointer Exception"
        for (int i = 0; i < array.length; i++) {
            array[i] = new Employee();
        }

        array[0].setEmployee("Ivanov", "Accountant", "001@hillel.com", "+380671111111", 45_800, 22);
        array[1].setEmployee("Petrov", "Designer", "002@hillel.com", "+380672222222", 55_100, 45);
        array[2].setEmployee("Sidorov", "Project manager", "003@hillel.com", "+380673333333", 65_200, 41);
        array[3].setEmployee("Zelensky", "President", "004@hillel.com", "+380674444444", 750_000, 48);
        array[4].setEmployee("Doroshenko", "Software engineer", "005@hillel.com", "+380675555555", 195_500, 39);

        for (int i = 0; i < array.length; i++) {
            if (array[i].age > 40) {
                array[i].printEmployee();
            }
        }
    }
}