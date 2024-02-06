package com.javaacademy.lessons.homework.homework4.ex1;

import static java.lang.String.*;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        AtomicInteger counter1 = new AtomicInteger();
        AtomicInteger counter2 = new AtomicInteger();

        Stream<Car> stream1 = Stream.generate(() ->
                        new Car("А" + createNumber(counter1.addAndGet(1)) + "AН799"))
                .limit(50);

        Stream<Car> stream2 = Stream.generate(() ->
                        new Car("K" + createNumber(counter2.addAndGet(1)) + "СЕ178"))
                .limit(50);

        String result = Stream.concat(stream1, stream2)
                .map(Car::getNumber)
                .filter(number -> number.substring(1, 3).contains("04"))
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }

    public static String createNumber(int counter) {
        return "0".repeat(3 - valueOf(counter).length()) + counter;
    }


}
