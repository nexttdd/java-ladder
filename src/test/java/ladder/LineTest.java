package ladder;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LineTest {
    @Test
    void 한명_라인한줄_만들기() {
        //given
        int numberOfPeople = 1;

        //when
        Line line = Line.of(numberOfPeople);

        //then
        assertThat(line.getBridges().size()).isEqualTo(numberOfPeople);
    }

    @Test
    void 두명_라인한줄_만들기() {
        //given
        int numberOfPeople = 2;

        //when
        Line line = Line.of(numberOfPeople);

        //then
        assertThat(line.getBridges().size()).isEqualTo(numberOfPeople);
    }

    @Test
    void 세명_라인한줄_만들기() {
        //given
        int numberOfPeople = 3;

        //when
        Line line = Line.of(numberOfPeople);

        //then
        assertThat(line.getBridges().size()).isEqualTo(numberOfPeople);
    }
}
