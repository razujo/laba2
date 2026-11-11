package ru.kostikov.lab2.geometry2d;

import ru.kostikov.lab2.exceptions.InvalidDimensionException;

// Прямоугольник со сторонами width и height.
public class Rectangle implements Figure {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        if (width <= 0) {
            throw new InvalidDimensionException("ширина", width);
        }
        if (height <= 0) {
            throw new InvalidDimensionException("высота", height);
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return String.format("Прямоугольник(%.2f x %.2f)", width, height);
    }
}
