package coordinate.domain.figure;

import coordinate.domain.Figure;
import coordinate.domain.Point;
import coordinate.domain.exception.DuplicatePointException;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

abstract class AbstractFigure implements Figure {
    private final List<Point> points;

    AbstractFigure(List<Point> points) {
        if (points.size() != size()) {
            throw new IllegalArgumentException(getName() + "의 길이는 " + size() + "이어야 합니다.");
        }

        if (!validateDuplicatedPoint(points)) {
            throw new DuplicatePointException("중복되는 점이 있습니다.");
        }

        this.points = points;
    }

    private boolean validateDuplicatedPoint(List<Point> points) {
        Set<Point> setPoint = new HashSet<>(points);
        return setPoint.size() == points.size();
    }

    protected Point getPoint(int index) {
        return points.get(index);
    }

    @Override
    public List<Point> getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "도형 종류: " + getName() +
                ", points=" + points +
                '}';
    }
}
