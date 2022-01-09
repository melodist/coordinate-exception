package coordinate.domain.figure;

import coordinate.domain.Figure;
import coordinate.domain.Point;
import coordinate.domain.exception.DuplicatePointException;
import coordinate.domain.exception.NotFoundFigureTypeException;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class FigureFactoryTest {
    @Test
    public void line() throws NotFoundFigureTypeException {
        List<Point> points = Arrays.asList(
                Point.of(1, 2),
                Point.of(2, 3));

        Figure figure = FigureFactory.getInstance(points);
        assertThat(figure).isInstanceOfAny(Line.class);
        assertThat(figure.getName()).isEqualTo("선");
    }

    @Test
    public void triangle() throws NotFoundFigureTypeException {
        List<Point> points = Arrays.asList(
                Point.of(1, 1),
                Point.of(4, 1),
                Point.of(1, 4));

        Figure figure = FigureFactory.getInstance(points);
        assertThat(figure).isInstanceOfAny(Triangle.class);
        assertThat(figure.getName()).isEqualTo("삼각형");
    }

    @Test
    public void rectangle() throws NotFoundFigureTypeException {
        List<Point> points = Arrays.asList(
                Point.of(1, 1),
                Point.of(4, 1),
                Point.of(1, 4),
                Point.of(4, 4));

        Figure figure = FigureFactory.getInstance(points);
        assertThat(figure).isInstanceOfAny(Rectangle.class);
        assertThat(figure.getName()).isEqualTo("사각형");
    }

    @Test
    public void 중복_포인트_선() throws Exception {
        // given
        List<Point> points = Arrays.asList(Point.of(1, 1), Point.of(1, 1));

        // when, then
        assertThatThrownBy(() -> FigureFactory.getInstance(points))
                .isInstanceOf(DuplicatePointException.class);
    }

    @Test
    public void 중복_포인트_삼각형() throws Exception {
        // given
        List<Point> points = Arrays.asList(
                Point.of(1, 1),
                Point.of(1, 1),
                Point.of(2, 2));

        // when, then
        assertThatThrownBy(() -> FigureFactory.getInstance(points))
                .isInstanceOf(DuplicatePointException.class);
    }

    @Test
    public void 중복_포인트_사각형() throws Exception {
        // given
        List<Point> points = Arrays.asList(
                Point.of(1, 1),
                Point.of(1, 1),
                Point.of(2, 2),
                Point.of(3, 3));

        // when, then
        assertThatThrownBy(() -> FigureFactory.getInstance(points))
                .isInstanceOf(DuplicatePointException.class);
    }

    @Test
    public void 일치하는_도형_없음_1포인트() throws NotFoundFigureTypeException {
        // given
        List<Point> points = Arrays.asList(Point.of(1, 1));

        // when, then
        assertThatThrownBy(() -> FigureFactory.getInstance(points))
                .isInstanceOf(NotFoundFigureTypeException.class);
    }

    @Test
    public void 일치하는_도형_없음_5포인트() throws NotFoundFigureTypeException {
        // given
        List<Point> points = Arrays.asList(
                Point.of(1, 1),
                Point.of(2, 5),
                Point.of(3, 2),
                Point.of(4, 1),
                Point.of(5, 5));

        // when, then
        assertThatThrownBy(() -> FigureFactory.getInstance(points))
                .isInstanceOf(NotFoundFigureTypeException.class);
    }

}
