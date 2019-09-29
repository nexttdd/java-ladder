import domain.LadderGameLevel;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LadderGameLevelTest {

    @Test
    public void getHeight() {
        //given
        String level = "상";

        //when
        int height = LadderGameLevel.of(level).getHeight();

        //then
        assertThat(height).isEqualTo(20);
    }

    @Test
    public void getHeight2() {
        //given
        String level = "중";

        //when
        int height = LadderGameLevel.of(level).getHeight();

        //then
        assertThat(height).isEqualTo(10);
    }

    @Test
    public void getHeight3() {
        //given
        String level = "하";

        //when
        int height = LadderGameLevel.of(level).getHeight();

        //then
        assertThat(height).isEqualTo(5);
    }
}