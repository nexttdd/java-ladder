package ladder;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class ResultTest {
    Map<String, String> map = new HashMap<>();

    @Test
    void 결과입력하기() {
        //when
        Result result = Result.of(map);

        //then
        assertThat(result).isNotNull();
    }

    @Test
    void 한명결과_확인하기() {
        //given
        map.put("name", "꽝");

        //when
        Result result = Result.of(map);

        //then
        assertThat(result.getResult("name")).isEqualTo("꽝");
    }
}
