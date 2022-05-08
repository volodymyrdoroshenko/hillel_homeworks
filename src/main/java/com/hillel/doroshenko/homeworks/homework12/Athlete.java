package com.hillel.doroshenko.homeworks.homework12;

public class Athlete {
    private final String name;
    private final int birthDay;
    private final int birthMonth;
    private final int birthYear;
    private final String email;
    private final String phone;
    private String surname;
    private int weight;
    private int pressure;
    private int stepsPerDay;
    private final int age;

    public Athlete(String name, int birthDay, int birthMonth, int birthYear, String email,
                   String phone, String surname, int weight, int pressure, int stepsPerDay) {
        this.name = name;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.age = 2022 - birthYear;
        this.email = email;
        this.phone = phone;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.stepsPerDay = stepsPerDay;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void setStepsPerDay(int stepsPerDay) {
        this.stepsPerDay = stepsPerDay;
    }

    public String getName() {
        return name;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getSurname() {
        return surname;
    }

    public int getWeight() {
        return weight;
    }

    public int getPressure() {
        return pressure;
    }

    public int getStepsPerDay() {
        return stepsPerDay;
    }

    public int getAge() {
        return age;
    }

    public void printAccountInfo() {
        System.out.println("===============================");
        System.out.println("Full name: " + name + " " + surname +
                "\nBirthday: " + birthDay + "/" + birthMonth + "/" + birthYear +
                "\nAge: " + age +
                "\nE-mail: " + email +
                "\nPhone number: " + phone +
                "\nWeight: " + weight +
                "\nPressure: " + pressure +
                "\nSteps per day: " + stepsPerDay);
    }
}