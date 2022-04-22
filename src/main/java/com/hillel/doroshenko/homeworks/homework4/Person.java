package com.hillel.doroshenko.homeworks.homework4;

public class Person {

    public static void main(String[] args) {
        String firstName1 = "Will";
        String lastName1 = "Smith";
        String city1 = "NewYork";
        String phone1 = "936729462846";

        String firstName2 = "Jackie";
        String lastName2 = "Chan";
        String city2 = "Shanghai";
        String phone2 = "12312412412";

        String firstName3 = "Sherlock";
        String lastName3 = "Holmes";
        String city3 = "London";
        String phone3 = "37742123513";

        System.out.println(personInfo(firstName1, lastName1, city1, phone1));
        System.out.println(personInfo(firstName2, lastName2, city2, phone2));
        System.out.println(personInfo(firstName3, lastName3, city3, phone3));

        int n = 1;
        System.out.println(n + "! = " + getFactorial(n));
    }

    public static String personInfo(String firstName, String lastName, String city, String phone) {
        return "Позвонить гражданину " + firstName + " " + lastName + " из города " + city + " можно по номеру " + phone;
    }

    public static int getFactorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * getFactorial(n - 1);
    }
}