package domain;

public enum LadderGameLevel {
    HARD("상", 20),
    NORMAL("중", 10),
    EASY("하", 5);

    private String level;
    private int height;

    LadderGameLevel(String level, int height) {
        this.level = level;
        this.height = height;
    }

    public static LadderGameLevel of(String levelName) {
        if(LadderGameLevel.EASY.level.equals(levelName)) {
            return LadderGameLevel.EASY;
        }

        if(LadderGameLevel.NORMAL.level.equals(levelName)) {
            return LadderGameLevel.NORMAL;
        }

        return LadderGameLevel.HARD;
    }

    public int getHeight() {
        return this.height;
    }
}
