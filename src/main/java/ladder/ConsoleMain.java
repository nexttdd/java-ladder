package ladder;

import ladder.view.InputView;
import ladder.view.OutputView;

import java.util.List;

public class ConsoleMain {
    public static void main(String[] args) {
        String[] names = InputView.inputNames();
        List<String> results = InputView.inputResult();
        String ladderGameLevel = InputView.inputLadderGameLevel();
        LadderGameLevelManager.init(ladderGameLevel);

        Ladder ladder = Ladder.of(names, LadderGameLevelManager.height);
        Result result = ladder.start(results);
        OutputView.printLadders(ladder, results);

        String userName = "";
        while (!Const.FORMAT_ALL.equals(userName)) {
            userName = InputView.inputCheckResult();
            OutputView.printReward(userName, result);
        }
    }
}
