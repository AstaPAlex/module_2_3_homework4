package com.javaacademy.lessons.homework.homework4.ex3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Runner {
    private static final List<Skyscraper> skyscrapers = new ArrayList<>();

    public static void main(String[] args) {
        addSkyscrapers();

        List<Skyscraper> skyscrapersDistinct = Runner.skyscrapers.stream()
                .distinct()
                .toList();

        System.out.println("Первые 3 небоскреба:");
        skyscrapersDistinct.stream()
                .limit(3)
                .forEach(System.out::println);
        System.out.println("_________________________________________");

        System.out.println("Самый высокий небоскреб");
        skyscrapersDistinct.stream()
                .max(Comparator.comparingInt(Skyscraper::getHeight))
                .ifPresent(System.out::println);
        System.out.println("_________________________________________");

        System.out.println("Небоскребы выше 1 км.:");
        skyscrapersDistinct.stream()
                .filter(e -> e.getHeight() > 800)
                .peek(System.out::println)
                .toList()
                .stream()
                .findAny()
                .ifPresentOrElse(e -> {}, () -> System.out.println("Таких небоскребов нет"));
    }

    private static void addSkyscrapers() {
        skyscrapers.add(new Skyscraper("Всемирный торговый центр", 541));
        skyscrapers.add(new Skyscraper("Шанхайская башня", 632));
        skyscrapers.add(new Skyscraper("Бурдж - Халифа", 828));
        skyscrapers.add(new Skyscraper("Международный финансовый центр Пинань", 599));
        skyscrapers.add(new Skyscraper("Абрадж аль-Бейт", 601));
        skyscrapers.add(new Skyscraper("Всемирный центр Лотте", 555));
        skyscrapers.add(new Skyscraper("Бурдж - Халифа", 828));
    }

}
