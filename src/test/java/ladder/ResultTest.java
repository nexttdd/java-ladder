package ladder;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class ResultTest {
    Map<String, String> results = new HashMap<>();

    @Test
    void 결과입력하기() {
        //when
        Result result = Result.of(results);

        //then
        assertThat(result).isNotNull();
    }

    @Test
    void 한명결과_확인하기() {
        //given
        results.put("name", "꽝");

        //when
        Result result = Result.of(results);

        //then
        assertThat(result.getResult("name")).isEqualTo("꽝");
    }
}
