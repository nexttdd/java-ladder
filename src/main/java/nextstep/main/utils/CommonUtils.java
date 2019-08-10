package nextstep.main.utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CommonUtils {
    public static String[] split(String value) {
        return value.split(Consts.NAME_SEPARATOR);
    }

    public static List<String> generates(String names) {
        return Arrays.stream(split(names))
                .map(String::new)
                .collect(Collectors.toList());
    }

    public static String arrangeName(String value) {
        String str = IntStream.range(0, Consts.MAX_NAME_COUNT - value.length())
                .mapToObj(i -> " ")
                .collect(Collectors.joining("", value, " "));
        return str;
    }
}
