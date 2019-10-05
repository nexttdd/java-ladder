package nextstep.main.vo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LadderLevelTest {
    @Test
    void 난이도에_따른_경계값_구하기() {
        String level = "하";
        int limit = LadderLevel.getLimit(level);

        assertThat(limit).isEqualTo(4);
    }
}