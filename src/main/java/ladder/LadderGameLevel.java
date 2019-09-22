package ladder;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum LadderGameLevel {
    HARD("상", 20, 10),
    NORMAL("중", 10, 7),
    EASY("하", 5, 4);

    public static final Map<String, Integer> levelHeights;

    static {
        levelHeights = Stream.of(LadderGameLevel.values())
                .collect(Collectors.toMap(o -> o.level, o -> o.height));
    }

    private String level;
    private Integer height;
    private Integer range;

    LadderGameLevel(String level, Integer height, Integer range) {
        this.level = level;
        this.height = height;
        this.range = range;
    }

    public static int getHeight(String ladderGameLevel) {
        if (levelHeights.containsKey(ladderGameLevel)) {
            return levelHeights.get(ladderGameLevel);
        }
        throw new IllegalArgumentException();
    }

    public static boolean getLineRange(String level, int randomNumber) {
        for (LadderGameLevel item : LadderGameLevel.values()) {
            if (item.level.equals(level)) {
                return randomNumber < item.range;
            }
        }

        throw new IllegalArgumentException();
    }
}
