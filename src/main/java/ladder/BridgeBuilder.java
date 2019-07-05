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
        return Bridge.of(determineGoLeft(beforeBridge), Boolean.FALSE);
    }

    public static Bridge buildMiddle(Bridge beforeBridge) {
        return Bridge.of(determineGoLeft(beforeBridge), random.nextBoolean());
    }

    private static boolean determineGoLeft(Bridge beforeBridge) {
        return beforeBridge.goRight() == Boolean.TRUE ? Boolean.FALSE : random.nextBoolean();
    }
}
