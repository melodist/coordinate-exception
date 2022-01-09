package coordinate.domain;

import java.util.Objects;

public class Point {
    private final int x;
    private final int y;

    private Point(int x, int y) {
        if (isNotValid(x) || isNotValid(y)) {
            throw new IllegalArgumentException("숫자의 범위가 적절하지 않습니다.");
        }
        this.x = x;
        this.y = y;
    }

    private boolean isNotValid(int number) {
        return number < 0 || number > 24;
    }

    public double getDistance(Point other) {
        int xDifference = other.minusX(x);
        int yDifference = other.minusY(y);
        return Math.sqrt(square(xDifference) + square(yDifference));
    }

    private int minusX(int number) {
        return this.x - number;
    }

    private int minusY(int number) {
        return this.y - number;
    }

    private static int square(int number) {
        return number * number;
    }

    public static Point of(int x, int y) {
        return new Point(x, y);
    }

    public static Point ofCommaSeparator(String text) {
        String[] values = text.split(",");
        return new Point(Integer.parseInt(values[0]), Integer.parseInt(values[1]));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
