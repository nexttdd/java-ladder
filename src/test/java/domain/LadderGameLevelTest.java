package domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LadderGameLevelTest {
    @ParameterizedTest
    @CsvSource({"상,20", "중,10", "하,5"})
    public void 난이도_입력받기(String inputLevel, int resultHeight) {
        //when
        int height = LadderGameLevel.of(inputLevel).getHeight();

        //then
        assertThat(height).isEqualTo(resultHeight);
    }

    @Test
    void 잘못입력받은경우() {
        //given
        String level = "sdsdg";

        //when, then
        assertThrows(IllegalArgumentException.class, () -> LadderGameLevel.of(level));
    }
}