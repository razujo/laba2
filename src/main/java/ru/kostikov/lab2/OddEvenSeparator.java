package ru.kostikov.lab2;

import java.util.ArrayList;
import java.util.List;

/**
 * Задание 4. Разделение добавленных чисел на чётные и нечётные с сохранением порядка.
 */
public class OddEvenSeparator {
    private final List<Integer> evens = new ArrayList<>();
    private final List<Integer> odds = new ArrayList<>();

    public void addNumber(int number) {
        if (number % 2 == 0) {
            evens.add(number);
        } else {
            odds.add(number);
        }
    }

    public void even() {
        System.out.println(evens);
    }

    public void odd() {
        System.out.println(odds);
    }
}
