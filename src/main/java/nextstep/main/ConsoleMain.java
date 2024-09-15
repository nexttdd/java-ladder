package nextstep.main;

import nextstep.main.utils.CommonUtils;
import nextstep.main.view.InputView;
import nextstep.main.view.ResultView;
import nextstep.main.vo.Ladder;
import nextstep.main.vo.LadderGameMapper;
import nextstep.main.vo.Persons;

import java.util.List;

import static nextstep.main.utils.Consts.ALL_PERSON;

public class ConsoleMain {
    public static void main(String[] args) {
        String playersName = InputView.playerNames();
        String playerResults = InputView.ladderResultPreDiction();

        int ladderHeight = InputView.maxLadderHeight();

        Persons persons = Persons.generate(playersName);
        List<String> results = CommonUtils.generates(playerResults);

        Ladder ladder = new Ladder();
        ladder.generateLadder(ladderHeight, persons.getPersonCount());

        ResultView.executeNames(persons);
        ResultView.drawLadder(ladder);
        ResultView.executeResults(results);

        LadderGameMapper ladderGameMapper = persons.settingResult(ladder, results);
        String personName = "";
        while (!ALL_PERSON.equals(personName)) {
            personName = InputView.personResult();
            String result = ladderGameMapper.getResult(personName, persons);
            ResultView.textResultPerson(result);
        }
    }
}
