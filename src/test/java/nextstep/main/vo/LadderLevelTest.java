package nextstep.main.vo;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LadderLevelTest {

    @Test
    public void 난이도에_따른_경계값_구하기_하() {
        int limit = LadderLevel.EASY.getLimit();

        assertThat(limit).isEqualTo(4);
    }

    @Test
    public void 난이도에_따른_경계값_구하기_중() {
        int limit = LadderLevel.NORMAL.getLimit();

        assertThat(limit).isEqualTo(7);
    }

    @Test
    public void 난이도에_따른_경계값_구하기_상() {
        int limit = LadderLevel.HARD.getLimit();

        assertThat(limit).isEqualTo(10);
    }
}