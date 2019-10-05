package nextstep.main.vo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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

    @ParameterizedTest
    @CsvSource({"하,3,true", "하,4,false"})
    public void 난이도에_따른_라인_만들기(String level, int number, boolean result) {
        LadderLevel ladderLevel = LadderLevel.of(level);
        //when
        boolean isGenerateLine = new Line().isGenerateLine(ladderLevel, number);

        //then
        assertThat(isGenerateLine).isEqualTo(result);
    }
}