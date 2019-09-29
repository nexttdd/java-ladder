import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LadderGameLevelTest {

    @Test
    public void getHeight() {
        //given
        String level = "상";

        //when
        int height = LadderGameLevel.getHeight(level);
        //then
        assertThat(height).isEqualTo(20);
    }
}