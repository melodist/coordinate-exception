package coordinate.domain;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class PointTest {
    @Test
    public void 생성() {
        Point a = Point.ofCommaSeparator("1,2");
        assertThat(a).isEqualTo(Point.of(1, 2));
    }

    @Test
    public void 예외_0_미만() {
        assertThatThrownBy(() -> Point.ofCommaSeparator("-1,3"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void 예외_24_초과() {
        assertThatThrownBy(() -> Point.ofCommaSeparator("1,25"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
