package nextstep.main.vo;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Person {
    private static final int MAX_NAME_COUNT = 5;

    private String name;

    public Person(String name) {
        if (name.length() > MAX_NAME_COUNT)
            throw new IllegalArgumentException();

        this.name = name;
    }

    @Override
    public String toString() {
        String str = IntStream.range(0, MAX_NAME_COUNT - this.name.length())
                .mapToObj(i -> " ")
                .collect(Collectors.joining("", this.name, " "));

        return str;
    }

    public boolean isMatch(String personName) {
        return name.equals(personName);
    }
}
