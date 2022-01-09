package coordinate.domain.figure;

import coordinate.domain.Point;

import static coordinate.domain.FigureType.RECTANGLE;

import java.util.List;

class Rectangle extends AbstractFigure {
    Rectangle(List<Point> points) {
        super(points);
    }

    @Override
    public int size() {
        return RECTANGLE.getSize();
    }

    @Override
    public String getName() {
        return RECTANGLE.getName();
    }

    @Override
    public double area() {
        return 0;
    }
}
