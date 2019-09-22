package ladder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
        int lastPosition = ladder.findLastPosition(startPosition);

        //then
        assertThat(lastPosition).isEqualTo(startPosition);
    }

    @Test
    void 사람이_0명인_경우() {
        //when
        name = new String[]{};

        //then
        assertThrows(IllegalArgumentException.class, () -> Ladder.of(name, height));
    }

    @Test
    void 사람이_null인_경우() {
        //when
        name = null;

        //then
        assertThrows(NullPointerException.class, () -> Ladder.of(name, height));
    }

    @DisplayName("비정상 이름 입력 확인")
    @ParameterizedTest
    @ValueSource(strings = {"123456", ""})
    void inputIllegalName(String inputName) {
        name = new String[]{inputName};
        assertThrows(IllegalArgumentException.class, () -> Ladder.of(name, height));
    }

    @Test
    void 사다리난이도가_하_인경우() {
        String level = "하";

        Ladder ladder = Ladder.of(names, level);

        assertThat(ladder.getHeight()).isEquals(5);
    }
}
