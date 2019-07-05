package nextstep.main.vo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Persons {
    private static final String NAME_SEPARATOR = ",";

    private List<Person> persons;

    public Persons(List<Person> players) {
        this.persons = Collections.unmodifiableList(players);
    }

    public static Persons generate(String names) {
        List<Person> persons = Arrays.stream(split(names))
                .map(Person::new)
                .collect(Collectors.toList());

        return new Persons(persons);
    }

    private static String[] split(String value) {
        return value.split(NAME_SEPARATOR);
    }

    public int getPersonCount() {
        return this.persons.size();
    }

    public List<Person> getPersons() {
        return this.persons;
    }
}
