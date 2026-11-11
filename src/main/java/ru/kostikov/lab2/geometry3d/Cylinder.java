package ru.kostikov.lab2.geometry3d;

import ru.kostikov.lab2.exceptions.InvalidDimensionException;
import ru.kostikov.lab2.exceptions.InvalidFigureException;
import ru.kostikov.lab2.geometry2d.Figure;

// Обобщённый цилиндр: основание — любая плоская фигура, объём = площадь основания * высота.
public class Cylinder {
    private final Figure base;
    private final double height;

    public Cylinder(Figure base, double height) {
        if (base == null) {
            throw new InvalidFigureException("У цилиндра должно быть основание");
        }
        if (height <= 0) {
            throw new InvalidDimensionException("высота цилиндра", height);
        }
        this.base = base;
        this.height = height;
    }

    public double volume() {
        return base.area() * height;
    }

    @Override
    public String toString() {
        return String.format("Цилиндр(основание = %s, h = %.2f)", base, height);
    }
}
