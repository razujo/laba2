package ru.kostikov.lab2;

import ru.kostikov.lab2.exceptions.InvalidDimensionException;
import ru.kostikov.lab2.exceptions.InvalidFigureException;
import ru.kostikov.lab2.geometry2d.Circle;
import ru.kostikov.lab2.geometry2d.Figure;
import ru.kostikov.lab2.geometry2d.Rectangle;
import ru.kostikov.lab2.geometry3d.Cylinder;

/**
 * Лабораторная работа №2. Проверка всех классов.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("===== Задание 1 =====");
        Button button = new Button();
        for (int i = 0; i < 4; i++) {
            button.click();
        }
        System.out.println();

        System.out.println("===== Задание 2 =====");
        Balance balance = new Balance();
        balance.addLeft(10);
        balance.addRight(7);
        System.out.print("Слева 10, справа 7:  ");
        balance.result();
        balance.addRight(3);
        System.out.print("Добавили справа 3:   ");
        balance.result();
        balance.addRight(5);
        System.out.print("Добавили справа 5:   ");
        balance.result();
        System.out.println();

        System.out.println("===== Задание 3 =====");
        Bell bell = new Bell();
        for (int i = 0; i < 5; i++) {
            bell.sound();
        }
        System.out.println();

        System.out.println("===== Задание 4 =====");
        OddEvenSeparator separator = new OddEvenSeparator();
        int[] numbers = {5, 12, 7, 8, 3, 20, 11, 4};
        for (int n : numbers) {
            separator.addNumber(n);
        }
        System.out.println("Добавлены: 5 12 7 8 3 20 11 4");
        System.out.print("Чётные:   ");
        separator.even();
        System.out.print("Нечётные: ");
        separator.odd();
        System.out.println();

        System.out.println("===== Задание 5 =====");
        Table table = new Table(3, 4);
        System.out.println("Новая таблица " + table.rows() + " x " + table.cols() + ":");
        System.out.println(table);
        for (int r = 0; r < table.rows(); r++) {
            for (int c = 0; c < table.cols(); c++) {
                table.setValue(r, c, (r + 1) * (c + 1));
            }
        }
        System.out.println("После заполнения setValue(r, c, (r+1)*(c+1)):");
        System.out.println(table);
        System.out.println("getValue(2, 3) = " + table.getValue(2, 3));
        System.out.println("average() = " + table.average());
        System.out.println();

        System.out.println("===== Задание 6 =====");
        Figure[] figures = {new Circle(2), new Rectangle(3, 4.5)};
        for (Figure f : figures) {
            System.out.printf("%s: площадь = %.2f, периметр = %.2f%n", f, f.area(), f.perimeter());
        }
        for (Figure f : figures) {
            Cylinder cylinder = new Cylinder(f, 10);
            System.out.printf("%s: объём = %.2f%n", cylinder, cylinder.volume());
        }

        System.out.println("\nПроверка исключений:");
        try {
            new Circle(-1);
        } catch (InvalidDimensionException e) {
            System.out.println("  InvalidDimensionException: " + e.getMessage());
        }
        try {
            new Cylinder(new Rectangle(1, 2), 0);
        } catch (InvalidDimensionException e) {
            System.out.println("  InvalidDimensionException: " + e.getMessage());
        }
        try {
            new Cylinder(null, 5);
        } catch (InvalidFigureException e) {
            System.out.println("  InvalidFigureException: " + e.getMessage());
        }
    }
}
