package ladder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LadderTest {
    int height;
    String[] name, names;

    @BeforeEach
    void setUp() {
        height = 1;
        name = new String[]{"yo"};
        names = new String[]{"yo", "jo", "한"};
    }

    @Test
    void 한명_높이1_사다리_만들기() {
        Ladder ladder = Ladder.of(names, height);

        assertThat(ladder.getLines().size()).isEqualTo(height);
    }

    @Test
    void 세명_높이5_사다리_만들기() {
        Ladder ladder = Ladder.of(names, height);

        assertThat(ladder.getLines().size()).isEqualTo(height);
    }

    @Test
    void 결과확인하기() {
        Ladder ladder = Ladder.of(name, height);
        int startPosition = 0;

        //when
        int lastPosition = ladder.findLastPosition("yo");

        //then
        assertThat(lastPosition).isEqualTo(startPosition);
    }

    @Test
    void 사람이_0명인_경우() {
        //when
        name = new String[]{};

        //then
        Assertions.assertThrows(IllegalArgumentException.class, () -> Ladder.of(name, height));
    }

    @Test
    void 사람이_null인_경우() {
        //when
        name = null;

        //then
        Assertions.assertThrows(NullPointerException.class, () -> Ladder.of(name, height));
    }

    @Test
    void 비정상_이름_입력_확인() {
    }
}
