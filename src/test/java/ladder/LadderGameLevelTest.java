package ladder;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;


class LadderGameLevelTest {
    @ParameterizedTest
    @CsvSource({"상,20", "중,10", "하,5"})
    void test(String ladderGameLevel, int expectedHeight) {
        //when
        int actualHeight = LadderGameLevel.getHeight(ladderGameLevel);

        //then
        assertThat(actualHeight).isEqualTo(expectedHeight);
    }

    @ParameterizedTest
    @CsvSource({"하,4,false", "중,6,true"})
    void 난이도_테스트(String level, int randomNumber, boolean result) {
        assertThat(LadderGameLevel.getLineRange(level, randomNumber)).isEqualTo(result);
    }

    @ParameterizedTest
    @CsvSource({"하"})
    void 난이도_테스트_최근상태값(String ladderGameLevel) {
        //then
        assertThat(ConsoleMain.ladderGameLevel).isEqualTo(ladderGameLevel);
    }
}