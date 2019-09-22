package ladder;

public class LadderGameLevelManager {
    public static String level;
    public static int height;

    static void init(String gameLevel) {
        level = gameLevel;
        height = LadderGameLevel.getHeight(gameLevel);
    }
}
