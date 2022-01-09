package coordinate.domain.figure;

import coordinate.domain.Point;

import static coordinate.domain.FigureType.LINE;

import java.util.List;

class Line extends AbstractFigure {
    Line(List<Point> points) {
        super(points);
    }

    @Override
    public int size() {
        return LINE.getSize();
    }

    @Override
    public String getName() {
        return LINE.getName();
    }

    @Override
    public double area() {
        return 0;
    }
}
