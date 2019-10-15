package domain;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertFalse;

public class PointTest {
    @Test
    public void 처음_Point는_왼쪽이_false이다() {
        Point first = Point.first();

        assertThat(first.isLeft()).isFalse();
    }

    @Test
    public void 마지막_Point는_우측이_fals이다() {
        Point first = Point.first();
        Point last = Point.last(first);

        assertThat(last.isRight()).isFalse();
    }

    @Test
    public void 이전_Point의_우측값은_Point의_왼쪽과_같다() {
        Point first = Point.first();

        assertThat(Point.of(first).isLeft()).isEqualTo(first.isRight());
    }

    @Test(expected = IllegalArgumentException.class)
    public void 좌측값과_우측값_모두_true일_수_없다() {
        Point.of(true, true);
    }

    @Test
    public void 이전_Point의_우측값이_true이면_Point의_우측값은_fals이다() {
        Point point = Point.of(false, true);

        Point result = Point.of(point);
        assertFalse(result.isRight());
    }
}