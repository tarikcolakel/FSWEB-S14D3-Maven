package org.example.company;

import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true; // Tüm araçlarda motor bulunuyor
        this.wheels = 4;    // Tüm araçların 4 tekeri var
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    @Override
    public String toString() {
        return "Car{name='" + name + "', cylinders=" + cylinders + ", engine=" + engine + ", wheels=" + wheels + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }

    public String startEngine() {
        String message = "the car's engine is starting";
        System.out.println(getClass().getSimpleName() + ": " + message);
        return message;  // ✅ Test için dönüş değeri eklendi
    }

    public String accelerate() {
        String message = "the car is accelerating";
        System.out.println(getClass().getSimpleName() + ": " + message);
        return message;  // ✅ Testin beklentisini karşılamak için dönüş değeri eklendi
    }

    public String brake() {
        String message = "the car is braking";
        System.out.println(getClass().getSimpleName() + ": " + message);
        return message;  // ✅ Test için dönüş değeri eklendi
    }
}
