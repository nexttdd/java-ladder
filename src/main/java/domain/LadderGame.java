package domain;

import java.util.ArrayList;
import java.util.List;

public class LadderGame {
    private final Players players;
    private final String[] results;

    public LadderGame(String[] playerNames, String[] results) {
        this.players = new Players(playerNames);
        this.results = results;
    }

    public List<Line> start(LadderGameLevel ladderGameLevel) {
        List<Line> lines = new ArrayList<>();

        for (int i = 0; i < ladderGameLevel.getHeight(); i++) {
            lines.add(new Line(players.countOfPlayers()));
        }

        return lines;
    }

    public Players getPlayers() {
        return players;
    }

    public String[] getResults() {
        return results;
    }
}
