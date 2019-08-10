package nextstep.main;

import nextstep.main.utils.CommonUtils;
import nextstep.main.view.InputView;
import nextstep.main.view.ResultView;
import nextstep.main.vo.Ladder;
import nextstep.main.vo.LadderGameMapper;
import nextstep.main.vo.Persons;

import java.util.List;

public class ConsoleMain {
    public static void main(String []args){
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

//        persons.settingResult(ladder, results);
        LadderGameMapper ladderGameMapper = persons.settingResult(ladder, results);
        String personName = InputView.personResult();
        String result = ladderGameMapper.findResultByName(persons.findIndexByName(personName));
        ResultView.textResultPerson(persons.getLadderResult(result));
    }
}
