package ladder;

import ladder.view.InputView;
import ladder.view.OutputView;

public class ConsoleMain {
    public static void main(String[] args) {
        String[] names = InputView.inputNames();
        Result result = Result.of(InputView.inputResult());
        int ladderHeight = InputView.inputLadderHeight();

        Ladder ladder = Ladder.of(names, ladderHeight);

        OutputView.printLadders(ladder, result);

        String userName = "";
        while (!"all".equals(userName)) {
            userName = InputView.inputCheckResult();
            OutputView.printReward(userName, ladder, result);
        }
    }
}
