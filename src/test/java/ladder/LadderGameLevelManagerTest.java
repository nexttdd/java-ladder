package ladder;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class LadderGameLevelManagerTest {
    @ParameterizedTest
    @CsvSource({"상,20", "중,10", "하,5"})
    void 난이도에따른_높이구하기(String level, int height) {
        //when
        LadderGameLevelManager.init(level);

        //then
        assertThat(LadderGameLevelManager.height).isEqualTo(height);
    }

    @ParameterizedTest
    @CsvSource({"상", "중", "하"})
    void 난이도_구하기(String level) {
        //given
        LadderGameLevelManager.init(level);

        //then
        assertThat(LadderGameLevelManager.level).isEqualTo(level);
    }
}