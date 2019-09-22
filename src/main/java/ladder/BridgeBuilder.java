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

    public static Bridge buildFirst() {
        return Bridge.of(Boolean.FALSE, random.nextBoolean());
    }

    public static Bridge buildLast(Bridge beforeBridge) {
        return Bridge.of(beforeBridge.goRight(), Boolean.FALSE);
    }

    public static Bridge buildMiddle(Bridge beforeBridge) {
        return Bridge.of(beforeBridge.goRight(), determineGoRight(beforeBridge));
    }

    private static boolean determineGoRight(Bridge beforeBridge) {
        return beforeBridge.goRight() ? Boolean.FALSE : randomForLadderLevel(LadderGameLevelManager.level);
    }

    public static boolean randomForLadderLevel(String level) {
        int randomNumber = new Random().nextInt(9) + 1;

        return LadderGameLevel.getLineRange(level, randomNumber);
    }
}
