package domain;

import java.util.ArrayList;
import java.util.List;

public class LadderGame {
    private final Players players;
    private final int ladderHeight;

    public LadderGame(String[] playerNames, int ladderHeight) {
        this.players = new Players(playerNames);
        this.ladderHeight = ladderHeight;
    }

    public List<Line> start() {
        List<Line> lines = new ArrayList<>();

        for(int i=0; i<ladderHeight; i++) {
            lines.add(new Line(players.countOfPlayers()));
        }

        return lines;
    }

    public Players getPlayers() {
        return players;
    }
}
