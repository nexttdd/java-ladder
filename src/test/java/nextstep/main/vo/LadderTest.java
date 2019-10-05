package nextstep.main.vo;

import nextstep.main.view.ResultView;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LadderTest {
    @Test
    public void 사다리_한줄_생성() {
        //given
        Ladder ladder = new Ladder();

        //when
        int result = ladder.generateLadder("하", 4);

        //then
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void 사다리_결과값알기() {
        //given
        Ladder ladder = new Ladder();

        //when
        ladder.generateLadder("하", 2);
        ResultView.drawLadder(ladder);

        int result =  ladder.getResult(0);

        //then
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void 난이도에_따른_사다리_갯수_정하기() {
        //given
        String level = "상";

        //when
        int height = new Ladder().getLadderHeight(level);

        //then
        assertThat(height).isEqualTo(20);
    }

    @Test(expected = IllegalArgumentException.class)
    public void 난이도에_따른_사다리_갯수_정하기_예외처리() {
        //given
        String level = "1234";

        //when
        int height = new Ladder().getLadderHeight(level);
    }
}