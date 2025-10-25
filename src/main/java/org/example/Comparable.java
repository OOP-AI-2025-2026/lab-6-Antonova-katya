package org.example;

class Car implements Comparable {
    private int price;
    private int year;
    private int horsePower;

    public Car(int price, int year, int horsePower) {
        this.price = price;
        this.year = year;
        this.horsePower = horsePower;
    }

    // Реалізація методу compareTo
    @Override
    public int compareTo(Object o) {
        Car other = (Car) o;

        // 1. Порівнюємо ціну
        if (this.price < other.price) {
            return 1; // 'this' "більше", бо воно дешевше
        }
        if (this.price > other.price) {
            return -1; // 'this' "менше", бо воно дорожче
        }

        // Якщо ціни рівні, переходимо до кроку 2
        // 2. Порівнюємо рік
        if (this.year > other.year) {
            return 1; // 'this' "більше", бо воно новіше
        }
        if (this.year < other.year) {
            return -1; // 'this' "менше", бо воно старіше
        }

        // Якщо роки рівні, переходимо до кроку 3
        // 3. Порівнюємо кінські сили
        if (this.horsePower > other.horsePower) {
            return 1; // 'this' "більше", бо має більше кінських сил
        }
        if (this.horsePower < other.horsePower) {
            return -1; // 'this' "менше"
        }

        return 0;  // Якщо всі параметри рівні
    }

    //  Гетери та сетери

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}

