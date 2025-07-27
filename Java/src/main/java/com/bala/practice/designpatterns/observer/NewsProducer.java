package com.bala.practice.designpatterns.observer;

public class NewsProducer {
    private NewsQueueListener queueListener;

    public NewsProducer(NewsQueueListener queueListener) {
        this.queueListener = queueListener;
    }

    public void publishNews(String news) {
        System.out.println("Producer publishing news: " + news);
        queueListener.setLatestNews(news);
    }
}
