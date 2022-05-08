package com.hillel.doroshenko.homeworks.homework12;

public class Burger {
    int bun;
    int meat;
    int cheese;
    int greens;
    int mayonnaise;

    public Burger(int bun, int meat, int cheese, int greens, int mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("Traditional burger: bun, meat, cheese, greens, mayonnaise");
    }

    public Burger(int bun, int meat, int cheese, int greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println("Dietary burger: bun, meat, cheese, greens");
    }

    public Burger(int bun, int meat, int cheese, int greens, int mayonnaise, boolean doubleMeat) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("Extra meat burger: bun, double meat, cheese, greens, mayonnaise");
    }
}