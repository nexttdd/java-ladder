package nextstep.main.vo;

import nextstep.main.view.ResultView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Persons {
    private static final String NAME_SEPARATOR = ",";

    private List<Person> persons;
    private List<Person> results;

    public Persons(List<Person> players) {
        this.persons = Collections.unmodifiableList(players);
        this.results = new ArrayList<>();
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

    public int getStartPosition(String personName) {
        int index = 0;
        for (Person person : persons) {
            if (person.isMatch(personName)) {
                return index;
            }
            index++;
        }
        throw new IllegalArgumentException("잘못된 참여자 이름입니다.");
    }

    public void settingResult(Ladder ladder, Persons results) {
        for (Person person : persons) {
            int position = 0;
            position = ladder.getResult(position);
            this.results.add(results.getPersons().get(position));
            System.out.println(results.getPersons().get(position));
        }


    }
}
