package domain;


import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class LineTest {

    @Test
    public void 라인한줄_만들기() {
        Line line = new Line(5);
        List<Point> points = line.getPoints();

        assertThat(points.size()).isEqualTo(5);
    }
}