package ladder;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum LadderGameLevel {
    HARD("상", 20),
    NORMAL("중", 10),
    EASY("하", 5);

    private String level;
    private Integer height;

    public static final Map<String, Integer> map;

    static {
        map = Stream.of(LadderGameLevel.values())
                .collect(Collectors.toMap(o -> o.level, o -> o.height));
    }

    LadderGameLevel(String level, Integer height) {
        this.level = level;
        this.height = height;
    }

    public static int getHeight(String ladderGameLevel) {
        return map.get(ladderGameLevel);
    }
}
