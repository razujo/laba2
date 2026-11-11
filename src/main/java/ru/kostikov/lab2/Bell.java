package ru.kostikov.lab2;

// Задание 3. Колокольчик: попеременно печатает ding и dong, начиная с ding.
public class Bell {
    private boolean ding = true;

    public void sound() {
        if (ding) {
            System.out.println("ding");
        } else {
            System.out.println("dong");
        }
        ding = !ding;
    }
}
