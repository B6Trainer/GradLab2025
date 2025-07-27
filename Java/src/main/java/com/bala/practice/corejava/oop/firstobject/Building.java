package com.bala.practice.corejava.oop.firstobject;

public class Building {

    //properties
    private String buildingName;

    //static
    public static Building getInstance(){
        Building obj = new Building("Airport");
        return obj;
    }

    //constructor
    private Building(String buildingName) {
        this.buildingName = buildingName;
    }

    //methods
    public String getBuildingName() {
        return buildingName;
    }

    private void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    void perform(String buildingName) {
        setBuildingName(buildingName);
    }




}
