package com.hillel.doroshenko.homeworks.homework15.interfaces;

public class Androids implements Smartphones, LinuxOS {
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
    public void linuxOS() {
        System.out.println("LinuxOS");
    }
}