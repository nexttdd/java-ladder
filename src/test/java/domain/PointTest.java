package domain;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class PointTest {
    @Test
    public void 이전Point의_right가_TRUE일때() {
        Point beforePoint = Point.first(Boolean.TRUE);
        Point currentPoint = Point.of(beforePoint);

        assertThat(currentPoint.isLeft()).isTrue();
        assertThat(currentPoint.isRight()).isFalse();
    }
}