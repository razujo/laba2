package ru.kostikov.lab2;

// Задание 1. Кнопка, считающая количество нажатий.
public class Button {
    private int clicks;

    public void click() {
        clicks++;
        System.out.println("Количество нажатий: " + clicks);
    }

    public int getClicks() {
        return clicks;
    }
}
