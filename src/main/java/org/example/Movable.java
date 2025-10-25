package org.example;

// Наданий інтерфейс
interface Movable {
    void setX(double x);
    void setY(double y);
    double getX();
    double getY();
    void moveTo(double x, double y);
}

// Реалізація класу Point
class Point implements Movable {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void setX(double x) {
        this.x = x;
    }

    @Override
    public void setY(double y) {
        this.y = y;
    }

    @Override
    public double getX() {
        return this.x;
    }

    @Override
    public double getY() {
        return this.y;
    }

    // Метод moveTo() встановлює обидві координати одночасно
    @Override
    public void moveTo(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

