package org.example;

// Надані інтерфейси
interface GPS {
    double[] getCoordinates();
}

interface Cellular {
    void makeCall();
    void receiveCall();
}

// Реалізація класу Smartphone
class Smartphone implements GPS, Cellular {
    private String model;
    private double latitude;
    private double longitude;

    public Smartphone(String model, double latitude, double longitude) {
        this.model = model;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Реалізація методу з інтерфейсу GPS
    @Override
    public double[] getCoordinates() {
        // Повертаємо масив з двох значень
        return new double[]{this.latitude, this.longitude};
    }

    // Реалізація методів з інтерфейсу Cellular
    @Override
    public void makeCall() {
        System.out.println(model + " робить дзвінок...");
    }

    @Override
    public void receiveCall() {
        System.out.println(model + " отримує дзвінок...");
    }

}

