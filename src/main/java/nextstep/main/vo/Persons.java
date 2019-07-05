package nextstep.main.vo;

import java.util.Arrays;
import java.util.List;

public class Persons {
    public static final int MAX_NAME_COUNT = 5;
    List<String> perons;

    public Persons(String... names) {
        for (String name : names) {
            if (name.length() > MAX_NAME_COUNT)
                throw new IllegalArgumentException();
        }
        perons = Arrays.asList(names);
    }
}
