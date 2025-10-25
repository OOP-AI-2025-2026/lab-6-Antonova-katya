package org.example;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Арчи");
        Animal cat = new Cat("Мурка");

        System.out.println(dog.getName() + " каже: " + dog.makeSound());
        System.out.println(cat.getName() + " каже: " + cat.makeSound());
    }
}

