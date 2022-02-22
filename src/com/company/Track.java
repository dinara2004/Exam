package com.company;

public class Track extends Vehicle{
    private double speed;

    public Track() {
    }

    public Track(String name, double counter, double speed) {
        super(name, counter);
        this.speed = speed;
    }

    public Track(double counter) {
        super(counter);
    }

    public Track(double counter, double speed) {
        super(counter);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public void drive() {
        System.out.println("Track is driving.");

    }

    @Override
    public void run() {
        System.out.println("Track is running.");

    }

    @Override
    public String toString() {
        return "Track{" +
                "speed=" + speed +
                "} " + super.toString();
    }

    @Override
    public void turnRight() {
        System.out.println("Track turn right");

    }

    @Override
    public void turnLeft() {
        System.out.println("Track turn left");

    }

    @Override
    public void goForward() {
        System.out.println("Track go forward");

    }

    @Override
    public void stop() {
        System.out.println("Track stop");

    }
}
