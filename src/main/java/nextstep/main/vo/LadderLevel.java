package nextstep.main.vo;

import java.text.Normalizer;

public enum LadderLevel {
    EASY("하", 4),
    NORMAL("중", 7),
    HARD("상", 10);

    private String level;
    private int limit;

    LadderLevel(String level, int limit) {
        this.level = level;
        this.limit = limit;
    }

    public static LadderLevel of(String levelName) {
        if(levelName.equals(LadderLevel.EASY.level)) {
            return LadderLevel.EASY;
        }

        if(levelName.equals(LadderLevel.NORMAL.level)) {
            return LadderLevel.NORMAL;
        }

        if(levelName.equals(LadderLevel.HARD.level)) {
            return LadderLevel.HARD;
        }

        throw new IllegalArgumentException();
    }

    public int getLimit() {
        return this.limit;
    }

    public boolean isLimit(int number) {
        return this.limit > number;
    }
}
