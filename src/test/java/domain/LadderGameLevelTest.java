package domain;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class LadderGameLevelTest {
    @ParameterizedTest
    @CsvSource({"상,20", "중,10", "하,5"})
    public void 난이도_입력받기(String inputLevel, int resultHeight) {
        //when
        int height = LadderGameLevel.of(inputLevel).getHeight();

        //then
        assertThat(height).isEqualTo(resultHeight);
    }
}