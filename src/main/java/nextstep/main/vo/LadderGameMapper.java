package nextstep.main.vo;

import java.util.List;
import java.util.Optional;

import static nextstep.main.utils.Consts.ALL_PERSON;

public class LadderGameMapper {
    private List<String> results;

    public LadderGameMapper(List<String> results) {
        this.results = results;
    }

    public static LadderGameMapper generate(List<String> userResults) {
        return new LadderGameMapper(userResults);
    }

    public String findResult(int index) {
        return Optional.ofNullable(results.get(index))
                .orElse("참여자 이름이 잘못됐습니다.");
    }

    public String getResult(String personName, Persons persons) {
        if (ALL_PERSON.equals(personName)) {
            List<Person> person = persons.getPersons();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < person.size(); i++) {
                sb.append(person.get(i).toString().trim() + " : " + results.get(i));
                sb.append("\n");
            }
            return sb.toString();
        }
        return findResult(persons.findIndexByName(personName));
    }
}
