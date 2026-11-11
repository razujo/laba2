package ru.kostikov.lab2;

// Задание 5. Двумерная таблица целых чисел. Строки и столбцы нумеруются с нуля,
// ячейки изначально заполнены нулями.
public class Table {
    private final int[][] data;

    public Table(int rows, int cols) {
        data = new int[rows][cols];
    }

    public int getValue(int row, int col) {
        return data[row][col];
    }

    public void setValue(int row, int col, int value) {
        data[row][col] = value;
    }

    public int rows() {
        return data.length;
    }

    public int cols() {
        return data.length == 0 ? 0 : data[0].length;
    }

    public double average() {
        long sum = 0;
        int count = 0;
        for (int[] row : data) {
            for (int value : row) {
                sum += value;
                count++;
            }
        }
        return count == 0 ? 0 : (double) sum / count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int r = 0; r < rows(); r++) {
            for (int c = 0; c < cols(); c++) {
                sb.append(String.format("%5d", data[r][c]));
            }
            if (r < rows() - 1) {
                sb.append('\n');
            }
        }
        return sb.toString();
    }
}
