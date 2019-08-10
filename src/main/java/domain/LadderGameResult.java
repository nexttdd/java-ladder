package domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LadderGameResult {

    private Map<Player, String> totalResult = new HashMap<>();

    public LadderGameResult(LadderGame ladderGame, List<Line> lines) {
        Players players = ladderGame.getPlayers();
        String[] results = ladderGame.getResults();

        for (int i = 0; i < players.size(); i++) {
            totalResult.put(players.getPlayer(i), results[findLineIndex(i, lines)]);
        }
    }

    private int findLineIndex(int start, List<Line> lines) {
        int result = start;
        for (int i = 0; i < lines.size(); i++) {
            Point point = lines.get(i).getPoints().get(result);
            if (point.isLeft()) {
                result--;
                continue;
            }
            if (point.isRight()) {
                result++;
                continue;
            }
        }
        return result;
    }

    public String findResult(String peopleToSeeResult) {

        if (peopleToSeeResult.equals("all")) {
            return getAllResults();
        }

        return totalResult.get(peopleToSeeResult);
    }

    private String getAllResults() {
        StringBuilder sb = new StringBuilder();
        totalResult.keySet().forEach(key -> {
            sb.append(key.toString())
                    .append(" : ")
                    .append(totalResult.get(key))
                    .append("\n");
        });

        return sb.toString();
    }
}
