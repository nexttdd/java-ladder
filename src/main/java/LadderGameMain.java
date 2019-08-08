import domain.LadderGame;
import view.InputView;
import view.ResultView;

public class LadderGameMain {
    public static void main(String[] args) {
        LadderGame ladderGame = new LadderGame(InputView.getPlayerNames(), InputView.getPlayResults());
        ResultView.printResult(ladderGame, ladderGame.start(InputView.getLadderHeight()));
    }
}
