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
        boolean goLeft = determineGoLeft(beforeBridge);
        return Bridge.of(goLeft, determineGoRight(goLeft));
    }

    private static boolean determineGoRight(boolean goLeft) {
        return goLeft ? Boolean.FALSE : random.nextBoolean();
    }

    private static boolean determineGoLeft(Bridge beforeBridge) {
        return beforeBridge.goRight() ? Boolean.FALSE : random.nextBoolean();
    }
}
