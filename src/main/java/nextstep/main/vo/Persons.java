package nextstep.main.vo;


import nextstep.main.utils.CommonUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Persons {
    private List<Person> persons;//사람이름, 초기 사다리 순서

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

    //result
    public LadderGameMapper settingResult(Ladder ladder, List<String> results) {
        List<String> userResults = new ArrayList<>();

        for (int i = 0; i < persons.size(); i++) {
            int resultPosition = ladder.getResult(i);
            userResults.add(results.get(resultPosition));
        }

        return LadderGameMapper.generate(userResults);
    }

//    public String getLadderResult(String personName) {
//        if (personName.equals("all")) {
//            StringBuilder sb = new StringBuilder();
//            for (int i = 0; i < persons.size(); i++) {
//                sb.append(persons.get(i).toString() + " : " + results.get(i).toString());
//                sb.append("\n");
//            }
//            return sb.toString();
//        }
//        int resultIdx = 0;
//        for (int i = 0; i < persons.size(); i++) {
//            if (personName.equals(persons.get(i))) {
//                resultIdx = i;
//                break;
//            }
//        }
//        return results.get(resultIdx).toString();
//    }

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
