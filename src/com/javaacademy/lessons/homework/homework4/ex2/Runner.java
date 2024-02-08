package com.javaacademy.lessons.homework.homework4.ex2;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        String[] words = new String[] {"тонь", "тополь", "боль", "рой", "стройка"};
        char ch = 'о';
        Arrays.stream(words)
                .map(word -> findCount(word, ch))
                .filter(counter -> counter > 0)
                .reduce(Long::sum)
                .ifPresentOrElse(System.out::println, () -> {
                    throw new RuntimeException();
                });
    }

    public static Long findCount(String word, char ch) {
        return word.chars()
                .filter(letter -> letter == ch)
                .count();
    }
}
