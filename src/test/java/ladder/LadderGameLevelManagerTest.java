package ladder;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LadderGameLevelManagerTest {

    @Test
    void 난이도에따른_높이구하기() {
        String level = "하";
        LadderGameLevelManager.init(level);

        assertThat(LadderGameLevelManager.height).isEqualTo(5);
    }

    @Test
    void 난이도_구하기() {
        String level = "중";
        LadderGameLevelManager.init(level);

        assertThat(LadderGameLevelManager.level).isEqualTo(level);
    }
}