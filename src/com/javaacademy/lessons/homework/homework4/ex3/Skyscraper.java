package com.javaacademy.lessons.homework.homework4.ex3;

import java.util.Objects;

public class Skyscraper {
    private final String name;
    private final int height;

    public Skyscraper(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Skyscraper{"
                + "name='" + name + '\''
                + ", height=" + height
                + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Skyscraper that = (Skyscraper) o;
        return height == that.height && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height);
    }

}
