package domain;

import java.util.Random;

public class RandomUtil implements GeneratorPoint {

    public static boolean getBoolean(boolean beforeRight) {
        if(beforeRight) {
            return Boolean.FALSE;
        }

        return new Random().nextBoolean();
    }

    @Override
    public boolean generate() {
        return false;
    }
}
