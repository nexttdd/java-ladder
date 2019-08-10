package nextstep.main.utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonUtils {
    public static String[] split(String value) {
        return value.split(Consts.NAME_SEPARATOR);
    }

    public static List<String> generates(String names) {
        return Arrays.stream(split(names))
                .map(String::new)
                .collect(Collectors.toList());
    }
}
