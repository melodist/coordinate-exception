package coordinate.domain.figure;

import coordinate.domain.Point;

import static coordinate.domain.FigureType.TRIANGLE;

import java.util.List;

class Triangle extends AbstractFigure {
    public Triangle(List<Point> points) {
        super(points);
    }

    @Override
    public int size() {
        return TRIANGLE.getSize();
    }

    @Override
    public String getName() {
        return TRIANGLE.getName();
    }

    @Override
    public double area() {
        return 0;
    }
}
