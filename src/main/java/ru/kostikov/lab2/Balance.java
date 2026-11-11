package ru.kostikov.lab2;

// Задание 2. Весы с двумя чашами.
public class Balance {
    private int left;
    private int right;

    public void addLeft(int weight) {
        left += weight;
    }

    public void addRight(int weight) {
        right += weight;
    }

    // Печатает "=" при равновесии, "R" — перевесила правая чаша, "L" — левая.
    public void result() {
        if (left == right) {
            System.out.println("=");
        } else if (right > left) {
            System.out.println("R");
        } else {
            System.out.println("L");
        }
    }
}
