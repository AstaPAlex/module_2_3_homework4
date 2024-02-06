package com.javaacademy.lessons.homework.homework4.ex1;

public class Car {
    private final String number;

    public Car(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car{"
                + "number='" + number + '\''
                + '}';
    }

    public String getNumber() {
        return number;
    }
}
