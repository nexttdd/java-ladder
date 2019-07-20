package domain;

import java.util.Random;

public class RandomUtil {

    public static boolean getBoolean() {
        return new Random().nextBoolean();
    }
}
