package domain;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    public void 이전Point의_right가_TRUE일때() {
        Point beforePoint = Point.first(Boolean.TRUE);
        Point currentPoint = Point.of(beforePoint);

        assertThat(currentPoint.getLeft()).is(Boolean.TRUE);
        assertThat(currentPoint.getRight()).is(Boolean.FALSE);
    }
}