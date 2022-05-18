package com.hillel.doroshenko.homeworks.homework15.polymorphism;

public class Main {
    public static void main(String[] args) {
        PopMusic popMusicBand = new PopMusic();
        RockMusic rockMusicBand = new RockMusic();
        ClassicMusic classicMusicBand = new ClassicMusic();

        popMusicBand.playMusic();
        rockMusicBand.playMusic();
        classicMusicBand.playMusic();
        System.out.println();

        MusicStyles[] array = new MusicStyles[]{popMusicBand, rockMusicBand, classicMusicBand};

        for (MusicStyles all : array) {
            all.playMusic();
        }
    }
}