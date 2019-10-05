package nextstep.main.vo;

public enum LadderLevel {
    EASY("하", 4);

    private String level;
    private int limit;

    LadderLevel(String level, int limit) {
        this.level = level;
        this.limit = limit;
    }

    public static int getLimit(String level) {
        return 0;
    }
}
