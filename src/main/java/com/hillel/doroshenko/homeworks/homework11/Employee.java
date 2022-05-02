package com.hillel.doroshenko.homeworks.homework11;

public class Employee {
    String name;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    public void setEmployee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printEmployee() {
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
    }
}