package nextstep.main.vo;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LadderTest {
    @Test
    public void 난이도에_따른_사다리_갯수_정하기() {
        //given, when
        int height = new Ladder().getLadderHeight(LadderLevel.HARD);

        //then
        assertThat(height).isEqualTo(20);
    }
}