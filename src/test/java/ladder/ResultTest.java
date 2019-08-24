package ladder;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class ResultTest {
    @ParameterizedTest
    @ValueSource(strings={"꽝,5000,꽝,3000", "100,꽝"})
    void 결과입력하기(String input) {
        //when
        Result result = Result.of(input);

        //then
        assertThat(result).isNotNull();
    }

    @Test
    void 한명결과_확인하기() {
        //given
        String input = "꽝";

        //when
        Result result = Result.of(input);

        Ladder ladder =  Ladder.of(new String[]{"name"}, 3);

        //then
        assertThat(result.findByPosition(ladder, "name")).isEqualTo("꽝");
    }
}
