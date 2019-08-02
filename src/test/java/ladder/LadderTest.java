package ladder;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LadderTest {
    //TODO : 비정상 이름 입력 확인
    @Test
    void 한명_높이1_사다리_만들기() {
        int height = 1;
        String[] names = {"yo"};
        Ladder ladder = Ladder.of(names, height);

        assertThat(ladder.getLines().size()).isEqualTo(height);
    }

    @Test
    void 세명_높이5_사다리_만들기() {
        int height = 5;
        String[] names = {"yo", "jo", "한"};
        Ladder ladder = Ladder.of(names, height);

        assertThat(ladder.getLines().size()).isEqualTo(height);
    }

    @Test
    void 결과확인하기() {
        int height = 5;
        String[] names = {"yo"};
        Ladder ladder = Ladder.of(names, height);
        int startPosition = 0;

        //when
        int lastPosition = ladder.findLastPosition("yo");

        //then
        assertThat(lastPosition).isEqualTo(0);
    }
}
