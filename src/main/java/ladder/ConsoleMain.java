package ladder;

import ladder.view.InputView;
import ladder.view.OutputView;

public class ConsoleMain {
    public static void main(String[] args) {
        String[] names = InputView.inputNames();
        Result result = Result.of(InputView.inputResult());
        int ladderHeight = InputView.inputLadderHeight();

        Ladder ladder = Ladder.of(names, ladderHeight);

        OutputView.printResult(ladder, result);
    }
}
