package com.bala.practice.designpatterns.observer;

import java.util.List;
import java.util.ArrayList;

public class NewsQueueListener implements Observable {
    private List<Observer> observers;
    private String latestNews;

    public NewsQueueListener() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(latestNews);
        }
    }

    public void setLatestNews(String news) {
        this.latestNews = news;
        notifyObservers();
    }
}
