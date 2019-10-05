package nextstep.main.vo;

import nextstep.main.view.ResultView;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LadderTest {
    @Test
    public void 사다리_결과값알기() {
        //given
        Ladder ladder = new Ladder();

        //when
        ladder.generateLadder(LadderLevel.EASY, 2);
        ResultView.drawLadder(ladder);

        int result =  ladder.getResult(0);

        //then
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void 난이도에_따른_사다리_갯수_정하기() {
        //given, when
        int height = new Ladder().getLadderHeight(LadderLevel.HARD);

        //then
        assertThat(height).isEqualTo(20);
    }
}