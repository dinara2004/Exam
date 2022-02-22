package com.company;

public class Main {

    public static void main(String[] args) {
        Vehicle track1 = new Track("Volva", 2000.0, 200.0);
        Tech track2 = new Track(3000.0);
        Track track3 = new Track(2500.0, 250.0);
        OperateCar track4 = new Track(3000.0);

        System.out.println(track1);
        System.out.println(track2);
        System.out.println(track3);
        System.out.println(track4);

        track1.drive();
        track2.run();
        track3.turnLeft();
        track3.turnRight();
        track3.goForward();
        track3.stop();
        track4.turnRight();
        track4.turnLeft();
        track4.goForward();
        track4.stop();



    }
}
