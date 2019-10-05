package nextstep.main.vo;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LineTest {
    @Test
    public void 라인이_겹치는_경우() {
        //given, when
        boolean result = Line.isEqual(true, true);

        //then
        assertThat(result).isEqualTo(true);
    }

    @Test
    public void 라인이_안겹치는_경우() {
        //given, when
        boolean result = Line.isEqual(true, false);

        //then
        assertThat(result).isEqualTo(false);
    }

    @Test
    public void 난이도에_따른_라인_만들기() {
        String level = "상";

    }
}