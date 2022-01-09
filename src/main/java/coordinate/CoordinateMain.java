package coordinate;

import coordinate.domain.Figure;
import coordinate.domain.exception.DuplicatePointException;
import coordinate.domain.exception.NotFoundFigureTypeException;
import coordinate.domain.figure.FigureFactory;
import coordinate.domain.Point;
import coordinate.domain.PointParser;
import coordinate.view.InputView;

import java.util.List;

public class CoordinateMain {
    public static void main(String[] args) {
        while (true) {
            try {
                List<Point> points = PointParser.parse(InputView.getPoint());
                Figure figure = FigureFactory.getInstance(points);
                System.out.println(figure);
                break;
            } catch (IllegalArgumentException |
                    DuplicatePointException |
                    NotFoundFigureTypeException e) {
                System.out.println(e.getMessage() + '\n');
            }
        }
    }
}
