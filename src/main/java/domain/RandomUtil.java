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

        return test();
    }

    public static int random() {
        return new Random().nextInt(10) + 1;
    }

    public static boolean test(){
        //1~9 하:1~3 중: 1~6, 상:1~9
        if("하".equals("하")&& random() < 4){
            return true;
        }

        if("중".equals() && random() < 7){
            return true;
        }

        if("상".equals() && random() < 9){
            return true;
        }

        return false;
    }
}
