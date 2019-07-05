package nextstep.main.vo;

public class Person {
    private static final int MAX_NAME_COUNT = 5;

    private String name;

    public Person(String name) {
        if (name.length() > MAX_NAME_COUNT)
            throw new IllegalArgumentException();

        this.name = name;
    }
}
