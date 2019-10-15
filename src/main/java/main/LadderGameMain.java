package main;

import domain.LadderGame;
import domain.LadderGameLevel;
import domain.LadderGameResult;
import domain.Line;
import view.InputView;
import view.ResultView;

import java.util.List;

public class LadderGameMain {
    public static LadderGameLevel ladderGameLevel;

    public static void main(String[] args) {
        LadderGame ladderGame = new LadderGame(InputView.getPlayerNames(), InputView.getPlayResults());

        ladderGameLevel = LadderGameLevel.of(InputView.getLadderGameLevel());
        List<Line> results = ladderGame.start(ladderGameLevel);
        ResultView.printResult(ladderGame, results);

        LadderGameResult ladderGameResult = new LadderGameResult(ladderGame, results);

        String whoResult = "";
        while(!whoResult.equals("all")) {
            whoResult = InputView.getPeopleToSeeResult();
            ResultView.printWhoResult(ladderGameResult.findResult(whoResult));
        }
    }
}
