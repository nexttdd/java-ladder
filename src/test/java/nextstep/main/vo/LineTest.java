package nextstep.main.vo;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LineTest {
    @Test
    public void 라인이_겹치는_경우() {
        boolean result = Line.isEqual(true, true);
        assertThat(result).isEqualTo(true);
    }

    @Test
    public void 라인이_안겹치는_경우() {
        boolean result = Line.isEqual(true, false);
        assertThat(result).isEqualTo(false);
    }
}