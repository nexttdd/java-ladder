import domain.Player;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class PlayerTest {

    @Test(expected = IllegalArgumentException.class)
    public void 이름_최대길이_초과() {

        new Player("김서영영영영영");
    }

    @Test
    public void 사람_생성() {
        Player sy = new Player("김서영");
        assertThat(sy).isNotNull();
    }

    @Test
    public void toString_테스트() {
        Player sy = new Player("김서영");
        assertThat(sy.toString()).isEqualTo("김서영");
    }
}