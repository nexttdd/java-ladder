package nextstep.main.vo;


import nextstep.main.utils.CommonUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Persons {
    private List<Person> persons;

    public Persons(List<Person> players) {
        this.persons = Collections.unmodifiableList(players);
    }

    public static Persons generate(String names) {
        List<Person> persons = Arrays.stream(CommonUtils.split(names))
                .map(Person::new)
                .collect(Collectors.toList());
        return new Persons(persons);
    }

    public int getPersonCount() {
        return this.persons.size();
    }

    public List<Person> getPersons() {
        return this.persons;
    }

    public LadderGameMapper settingResult(Ladder ladder, List<String> results) {
        List<String> userResults = new ArrayList<>();

        for (int i = 0; i < persons.size(); i++) {
            int resultPosition = ladder.getResult(i);
            userResults.add(results.get(resultPosition));
        }

        return LadderGameMapper.generate(userResults);
    }

    public int findIndexByName(String name) {
        int index = 0;

        for (Person person : persons) {
            if (person.isMatch(name)) {
                return index;
            }
            index++;
        }

        throw new IllegalArgumentException("잘못된 참여자 이름입니다.");
    }
}
