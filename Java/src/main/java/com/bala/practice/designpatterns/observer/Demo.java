package com.bala.practice.designpatterns.observer;

public class Demo {
    public static void main(String[] args) {
        NewsQueueListener newsQueueListener = new NewsQueueListener();

        Observer socialMediaPublisher = new SocialMediaPublisher("SocialMedia");
        Observer tvChannelPublisher = new TVChannelPublisher("TVChannel");

        newsQueueListener.addObserver(socialMediaPublisher);
        newsQueueListener.addObserver(tvChannelPublisher);

        NewsProducer newsProducer = new NewsProducer(newsQueueListener);

        newsProducer.publishNews("Breaking News: New Observer Pattern Example Released!");
        //newsProducer.publishNews("Update: Observer Pattern Implementation Simplified!");
    }
}
