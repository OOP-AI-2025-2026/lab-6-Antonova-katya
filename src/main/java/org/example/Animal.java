package org.example;

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract String makeSound();
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    String makeSound() {
        return "Гав!";
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    String makeSound() {
        return "Мяу!";
    }
}

