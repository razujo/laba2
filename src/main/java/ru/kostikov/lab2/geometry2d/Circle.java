package ru.kostikov.lab2.geometry2d;

import ru.kostikov.lab2.exceptions.InvalidDimensionException;

/**
 * Круг заданного радиуса.
 */
public class Circle implements Figure {
    private final double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new InvalidDimensionException("радиус", radius);
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return String.format("Круг(r = %.2f)", radius);
    }
}
