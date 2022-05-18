package com.hillel.doroshenko.homeworks.homework15.interfaces;

public class iPhones implements Smartphones, iOS {
    @Override
    public void call() {
        System.out.println("Call");
    }

    @Override
    public void sms() {
        System.out.println("SMS");
    }

    @Override
    public void internet() {
        System.out.println("Internet");
    }

    @Override
    public void iOS() {
        System.out.println("iOS");
    }
}