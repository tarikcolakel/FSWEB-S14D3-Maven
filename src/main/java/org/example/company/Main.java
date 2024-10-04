package org.example.company;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Mitsubishi(6, "Lancer");
        Car car2 = new Holden(8, "Commodore");
        Car car3 = new Ford(6, "Mustang");

        car1.startEngine();
        car1.accelerate();
        car1.brake();

        car2.startEngine();
        car2.accelerate();
        car2.brake();

        car3.startEngine();
        car3.accelerate();
        car3.brake();

    }
}