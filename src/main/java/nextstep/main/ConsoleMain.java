package nextstep.main;

import nextstep.main.view.InputView;
import nextstep.main.view.ResultView;
import nextstep.main.vo.Ladder;
import nextstep.main.vo.Persons;

public class ConsoleMain {
    public static void main(String []args){
        String playersName = InputView.playerNames();
        int ladderHeight = InputView.maxLadderHeight();

        Persons persons = Persons.generate(playersName);

        Ladder ladder = new Ladder();
        ladder.generateLadder(ladderHeight, persons.getPersonCount());

        ResultView.executeNames(persons);
        ResultView.drawLadder(ladder);
    }
}
