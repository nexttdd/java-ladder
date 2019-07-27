package ladder;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BridgeBuilderTest {
    @Test
    public void 한명일때_다리생성() {
        //when
        Bridge bridge = BridgeBuilder.buildOne();

        //then
        assertThat(bridge.goLeft()).isFalse();
        assertThat(bridge.goRight()).isFalse();
    }

    @Test
    public void 가장_왼쪽다리_생셩() {
        //when
        Bridge bridge = BridgeBuilder.buildLeft();

        //then
        assertThat(bridge.goLeft()).isFalse();
    }

    @Test
    public void 가장_오른쪽다리_생성() {
        //given
        Bridge beforeBridge = Bridge.of(Boolean.FALSE, Boolean.TRUE);

        //when
        Bridge rightBridge = BridgeBuilder.buildRight(beforeBridge);

        //then
        assertThat(rightBridge.goLeft()).isTrue();
        assertThat(rightBridge.goRight()).isFalse();
    }

    @Test
    public void 중간다리_생성() {
        //given
        Bridge beforeBridge = Bridge.of(Boolean.FALSE, Boolean.TRUE);

        //when
        Bridge currentBridge = BridgeBuilder.buildMiddle(beforeBridge);

        //then
        assertThat(currentBridge.goLeft()).isTrue();
        assertThat(currentBridge.goRight()).isFalse();
    }
}
