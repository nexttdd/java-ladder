package domain;

import main.LadderGameMain;

import java.util.Random;

public class RandomUtil {
    public static boolean getBoolean() {
        return new Random().nextBoolean();
    }

    public static boolean getBoolean(boolean beforeRight) {
        if (beforeRight) {
            return Boolean.FALSE;
        }

        return determineMakeLine(LadderGameMain.ladderGameLevel, random());
    }

    public static int random() {
        return new Random().nextInt(10) + 1;
    }

    public static boolean determineMakeLine(LadderGameLevel level, int randomNumber) {
        if (LadderGameLevel.EASY.equals(level) && randomNumber < 4) {
            return true;
        }

        if (LadderGameLevel.NORMAL.equals(level) && randomNumber < 7) {
            return true;
        }

        if (LadderGameLevel.HARD.equals(level) && randomNumber < 10) {
            return true;
        }

        return false;
    }
}
