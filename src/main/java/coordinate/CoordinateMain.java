package coordinate;

import coordinate.domain.Figure;
import coordinate.domain.figure.FigureFactory;
import coordinate.domain.Point;
import coordinate.domain.PointParser;
import coordinate.view.InputView;

import java.util.List;

public class CoordinateMain {
    public static void main(String[] args) {
        try {
            List<Point> points = PointParser.parse(InputView.getPoint());
            Figure figure = FigureFactory.getInstance(points);
            System.out.println(figure);
        } catch (Exception e) {

        }
    }
}
