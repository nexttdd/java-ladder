package nextstep.main.vo;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LadderTest {
    @Test
    public void 사다리_한줄_생성() {
        //given
        Ladder ladder = new Ladder();

        //when
        int result = ladder.generateLadder(1, 4);

        //then
        assertThat(result).isEqualTo(1);
    }
}