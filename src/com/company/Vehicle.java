package com.company;

public abstract class Vehicle extends Tech implements OperateCar {
    private double counter;

    public Vehicle() {
    }

    public Vehicle(String name, double counter) {
        super(name);
        this.counter = counter;
    }

    public Vehicle(double counter) {
        this.counter = counter;
    }

    public double getCounter() {
        return counter;
    }

    public void setCounter(double counter) {
        this.counter = counter;
    }
    public abstract void drive();

    @Override
    public String toString() {
        return "Vehicle{" +
                "counter=" + counter +
                "} " + super.toString();
    }
}
