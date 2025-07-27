package com.bala.practice.designpatterns.facade;

class HomeTheaterFacade {
    private Demo.DVDPlayer dvdPlayer;
    private Demo.Projector projector;
    private Demo.Speakers speakers;

    public HomeTheaterFacade(Demo.DVDPlayer dvdPlayer, Demo.Projector projector, Demo.Speakers speakers) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.speakers = speakers;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        dvdPlayer.on();
        projector.on();
        speakers.on();
        speakers.setVolume(10);
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println();
        System.out.println("Shutting movie theater down...");
        dvdPlayer.off();
        projector.off();
        speakers.off();
    }
}
