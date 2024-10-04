package org.example.company;

public class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        String message = "Mitsubishi's engine is roaring!";
        System.out.println(getClass().getSimpleName() + ": " + message);
        return message; // ✅ Testin beklentisini karşılamak için dönüş değeri eklendi
    }

    @Override
    public String accelerate() {
        String message = "Mitsubishi is zooming ahead!";
        System.out.println(getClass().getSimpleName() + ": " + message);
        return message; // ✅ Testin beklentisini karşılamak için dönüş değeri eklendi
    }

    @Override
    public String brake() {
        String message = "Mitsubishi is coming to a stop.";
        System.out.println(getClass().getSimpleName() + ": " + message);
        return message; // ✅ Testin beklentisini karşılamak için dönüş değeri eklendi
    }
}
