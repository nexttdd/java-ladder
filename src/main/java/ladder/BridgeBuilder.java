package ladder;

import java.util.Random;

public class BridgeBuilder {
    private static Random random;

    static {
        random = new Random();
    }

    public static Bridge buildOne() {
        return Bridge.of(Boolean.FALSE, Boolean.FALSE);
    }

    public static Bridge buildLeft() {
        return Bridge.of(Boolean.FALSE, random.nextBoolean());
    }

    public static Bridge buildRight(Bridge beforeBridge) {
        return Bridge.of(beforeBridge.goRight(), Boolean.FALSE);
    }

    public static Bridge buildMiddle(Bridge beforeBridge) {
        return Bridge.of(beforeBridge.goRight(), determineGoRight(beforeBridge));
    }

    private static boolean determineGoRight(Bridge beforeBridge) {
        return beforeBridge.goRight() ? Boolean.FALSE : random.nextBoolean();
    }
}
