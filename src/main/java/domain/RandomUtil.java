package domain;

import java.util.Random;

public class RandomUtil {
    public static boolean getBoolean() {
        return new Random().nextBoolean();
    }

    public static boolean getBoolean(boolean beforeRight) {
        if (beforeRight) {
            return Boolean.FALSE;
        }

        String level = "하";
        return determineMakeLine(level, random());
    }

    public static int random() {
        return new Random().nextInt(10) + 1;
    }

    public static boolean determineMakeLine(String level, int randomNumber){
        //1~9 하:1~3 중: 1~6, 상:1~9
        if("하".equals(level)&& randomNumber < 4){
            return true;
        }

        if("중".equals(level) && randomNumber < 7){
            return true;
        }

        if("상".equals(level) && randomNumber < 10){
            return true;
        }

        return false;
    }
}
