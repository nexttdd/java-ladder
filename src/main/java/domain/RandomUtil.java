package domain;

import java.util.Random;

public class RandomUtil {

    public static boolean getBoolean() {
        return new Random().nextBoolean();
    }

    public static boolean getBoolean(boolean beforeRight) {
        if(beforeRight) {
            return Boolean.FALSE;
        }

        return new Random().nextBoolean();
    }
}
