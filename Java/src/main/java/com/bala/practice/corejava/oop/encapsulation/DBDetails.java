package com.bala.practice.corejava.oop.encapsulation;

public class DBDetails {

    private String UserId;
    private String password;

    public DBDetails(String userId, String password) {
        UserId = userId;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getUserId() {
        return UserId;
    }


}
