package ru.kostikov.lab2.exceptions;

// Размер фигуры (радиус, сторона, высота) не положителен.
public class InvalidDimensionException extends RuntimeException {
    public InvalidDimensionException(String name, double value) {
        super("Некорректный размер «" + name + "»: " + value + " (должен быть больше нуля)");
    }
}
