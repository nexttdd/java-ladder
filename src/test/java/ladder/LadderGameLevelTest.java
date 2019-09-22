package ladder;

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
}