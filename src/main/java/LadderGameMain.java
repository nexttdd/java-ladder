import domain.LadderGame;
import domain.LadderGameResult;
import domain.Line;
import view.InputView;
import view.ResultView;

import java.util.List;

public class LadderGameMain {
    public static void main(String[] args) {
        LadderGame ladderGame = new LadderGame(InputView.getPlayerNames(), InputView.getPlayResults());
        String laddeerGameLevel = InputView.getLadderGameLevel();

        List<Line> results = ladderGame.start(InputView.getLadderHeight());
        ResultView.printResult(ladderGame, results);
        LadderGameResult ladderGameResult = new LadderGameResult(ladderGame, results);
        String whoResult1 = InputView.getPeopleToSeeResult();
        ResultView.printWhoResult(ladderGameResult.findResult(whoResult1));
        String whoResult2 = InputView.getPeopleToSeeResult();
        ResultView.printWhoResult(ladderGameResult.findResult(whoResult2));
    }
}
