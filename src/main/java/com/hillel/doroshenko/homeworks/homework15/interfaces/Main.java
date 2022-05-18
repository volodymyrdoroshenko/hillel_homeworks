package com.hillel.doroshenko.homeworks.homework15.interfaces;

public class Main {
    public static void main(String[] args) {

        Androids android1 = new Androids();
        android1.call();
        android1.sms();
        android1.internet();
        android1.linuxOS();

        iPhones iPhone1 = new iPhones();
        System.out.println();
        iPhone1.call();
        iPhone1.sms();
        iPhone1.internet();
        iPhone1.iOS();
    }
}