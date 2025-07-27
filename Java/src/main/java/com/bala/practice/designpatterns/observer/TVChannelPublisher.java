package com.bala.practice.designpatterns.observer;

public class TVChannelPublisher implements Observer {
    private String name;

    public TVChannelPublisher(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " broadcasting news: " + news);
    }
}
