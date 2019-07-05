package ladder;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BridgeTest {
    @Test
    public void 좌측으로_이동() {
        //when
        Bridge bridge = Bridge.of(Boolean.TRUE, Boolean.FALSE);

        //then
        assertThat(bridge.goLeft()).isTrue();
    }

    @Test
    public void 우측으로_이동() {
        //when
        Bridge bridge = Bridge.of(Boolean.FALSE, Boolean.TRUE);

        //then
        assertThat(bridge.goRight()).isTrue();
    }

    @Test
    public void 양쪽_모두_이동_에러처리() {
        //when, then
        assertThrows(IllegalArgumentException.class, () -> Bridge.of(Boolean.TRUE, Boolean.TRUE));
    }
}