package ru.kostikov.lab2.exceptions;

// Фигура не может быть использована, например, у цилиндра не задано основание.
public class InvalidFigureException extends RuntimeException {
    public InvalidFigureException(String message) {
        super(message);
    }
}
