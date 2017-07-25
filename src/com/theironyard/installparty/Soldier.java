package com.theironyard.installparty;

public abstract class Soldier {
    String name;
    String rank;
    double serialNumber;

    public abstract String speak();

    abstract boolean hasSlept();
    abstract boolean hasEaten();

}
