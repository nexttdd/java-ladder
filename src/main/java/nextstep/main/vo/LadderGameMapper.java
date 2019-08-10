package nextstep.main.vo;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class LadderGameMapper {
    private List<String> results;//사다리탄 결과

    public LadderGameMapper(List<String> results) {
        this.results = results;
    }

    public static LadderGameMapper generate(List<String> userResults) {
        return new LadderGameMapper(userResults);
    }

    //참여자이름으로 결과 확인하기
    public String findResultByName(int index) {
        return Optional.ofNullable(results.get(index))
                .orElse("참여자 이름이 잘못됐습니다.");
    }

    public String all(String personName, Persons persons) {
        if("all".equals(personName)){
            List<Person> person = persons.getPersons();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < person.size(); i++) {
                sb.append(person.get(i).toString().trim() + " : " + results.get(i));
                sb.append("\n");
            }
            return sb.toString();
        }
          return findResultByName(persons.findIndexByName(personName));
    }
}
