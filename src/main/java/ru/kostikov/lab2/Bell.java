package ru.kostikov.lab2;

/**
 * Задание 3. Колокольчик: попеременно печатает ding и dong, начиная с ding.
 */
public class Bell {
    private boolean ding = true;

    public void sound() {
        System.out.println(ding ? "ding" : "dong");
        ding = !ding;
    }
}
