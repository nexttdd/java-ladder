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

    public static int getHeight(String level) {
        return 20;
    }
}
