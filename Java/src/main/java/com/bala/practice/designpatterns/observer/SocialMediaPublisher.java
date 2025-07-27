package com.bala.practice.designpatterns.observer;

public class SocialMediaPublisher implements Observer {
    private String name;

    public SocialMediaPublisher(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " received news: " + news);
    }
}
