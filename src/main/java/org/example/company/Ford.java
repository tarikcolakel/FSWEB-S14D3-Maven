package org.example.company;

public class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        String message = "Ford's engine is roaring to life!";
        System.out.println(getClass().getSimpleName() + ": " + message);
        return message; // ✅ Testin beklentisini karşılamak için dönüş değeri eklendi
    }

    @Override
    public String accelerate() {
        String message = "Ford is picking up speed!";
        System.out.println(getClass().getSimpleName() + ": " + message);
        return message; // ✅ Testin beklentisini karşılamak için dönüş değeri eklendi
    }

    @Override
    public String brake() {
        String message = "Ford is coming to a halt.";
        System.out.println(getClass().getSimpleName() + ": " + message);
        return message; // ✅ Testin beklentisini karşılamak için dönüş değeri eklendi
    }
}
