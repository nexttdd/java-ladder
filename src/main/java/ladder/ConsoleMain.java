package ladder;

import ladder.view.InputView;
import ladder.view.OutputView;

import java.util.List;

public class ConsoleMain {
    public static String ladderGameLevel = "하";
    public static void main(String[] args) {
        String[] names = InputView.inputNames();
        List<String> results = InputView.inputResult();
        ladderGameLevel = InputView.inputLadderGameLevel();
        int ladderHeight = LadderGameLevel.getHeight(ladderGameLevel);

        Ladder ladder = Ladder.of(names, ladderHeight);
        Result result = ladder.start(results);
        OutputView.printLadders(ladder, results);

        String userName = "";
        while (!Const.FORMAT_ALL.equals(userName)) {
            userName = InputView.inputCheckResult();
            OutputView.printReward(userName, result);
        }
    }
}
