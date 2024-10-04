package org.example.company;

public class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        String message = "Holden's engine is starting!";
        System.out.println(getClass().getSimpleName() + ": " + message);
        return message; // ✅ Testin beklentisini karşılamak için dönüş değeri eklendi
    }

    @Override
    public String accelerate() {
        String message = "Holden is speeding up!";
        System.out.println(getClass().getSimpleName() + ": " + message);
        return message; // ✅ Testin beklentisini karşılamak için dönüş değeri eklendi
    }

    @Override
    public String brake() {
        String message = "Holden is slowing down.";
        System.out.println(getClass().getSimpleName() + ": " + message);
        return message; // ✅ Testin beklentisini karşılamak için dönüş değeri eklendi
    }
}
