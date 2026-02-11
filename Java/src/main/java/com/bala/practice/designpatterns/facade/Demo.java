package com.bala.practice.designpatterns.facade;

public class Demo {
    public static void main(String[] args) {
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        Speakers speakers = new Speakers();


        //USER
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, projector, speakers);

        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();
    }

    static class DVDPlayer {
        void on() {
            System.out.println("DVD Player is on");
        }

        void play(String movie) {
            System.out.println("Playing movie: " + movie);
        }

        void off() {
            System.out.println("DVD Player is off");
        }
    }

    static  class Projector {
        void on() {
            System.out.println("Projector is on");
        }

        void off() {
            System.out.println("Projector is off");
        }
    }

    static class Speakers {
        void on() {
            System.out.println("Speakers are on");
        }

        void setVolume(int level) {
            System.out.println("Setting volume to " + level);
        }

        void off() {
            System.out.println("Speakers are off");
        }
    }

}
