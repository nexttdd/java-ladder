package ladder;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum LadderGameLevel {
    HARD("상", 20, 10),
    NORMAL("중", 10, 7),
    EASY("하", 5, 4);

    private String level;
    private Integer height;
    private Integer range;

    public static final Map<String, Integer> map;

    static {
        map = Stream.of(LadderGameLevel.values())
                .collect(Collectors.toMap(o -> o.level, o -> o.height));
    }

    LadderGameLevel(String level, Integer height, Integer range) {
        this.level = level;
        this.height = height;
        this.range = range;
    }

    public static int getHeight(String ladderGameLevel) {
        if(map.containsKey(ladderGameLevel)){
            return map.get(ladderGameLevel);
        }
        throw new IllegalArgumentException();
    }
}
