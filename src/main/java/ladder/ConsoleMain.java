package ladder;

import ladder.view.InputView;
import ladder.view.OutputView;

import java.util.List;

public class ConsoleMain {
    public static void main(String[] args) {
        String[] names = InputView.inputNames();
        List<String> results = InputView.inputResult();
        int ladderHeight = InputView.inputLadderHeight();

        Ladder ladder = Ladder.of(names, ladderHeight);
        Result2 result = ladder.start(results);
        OutputView.printLadders(ladder, results);

        String userName = "";
        while (!"all".equals(userName)) {
            userName = InputView.inputCheckResult();
            OutputView.printReward(userName, ladder, result);
        }
    }
}
