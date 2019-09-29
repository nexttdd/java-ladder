package domain;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class RandomUtilTest {
    @ParameterizedTest
    @CsvSource({"하,3,true", "중,6,true", "상,9,true"
            , "하,4,false", "중,7,false", "상,10,false"
    })
    void 난이도에_따른_다리생성_확인(String level, int randomNumber, boolean isResult) {
        boolean result = RandomUtil.determineMakeLine(level, randomNumber);

        assertThat(result).isEqualTo(isResult);
    }
}