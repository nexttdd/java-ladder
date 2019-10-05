package nextstep.main.vo;

import java.util.*;
import java.util.stream.IntStream;

public class Ladder {
    private List<Line> lines;
    private static final Map<String, Integer> heights;
    static {
        heights = new HashMap<>();
        heights.put("상", 20);
        heights.put("중", 10);
        heights.put("하", 5);
    }

    public Ladder() {
        this.lines = new ArrayList<>();
    }

    public int generateLadder(int ladderHeight, int playerCount) {
        IntStream.range(0, ladderHeight)
                .mapToObj(item -> new Line(playerCount))
                .forEach(line -> this.lines.add(line));

        return this.lines.size();
    }

    public int generateLadder(String ladderLevel, int playerCount) {
        int ladderHeight = getLadderHeight(ladderLevel);

        IntStream.range(0, ladderHeight)
                .mapToObj(item -> new Line(playerCount))
                .forEach(line -> this.lines.add(line));

        return this.lines.size();
    }

    public int getLadderHeight(String ladderLevel){
        return Optional.of(heights.get(ladderLevel))
                .orElseThrow(IllegalArgumentException::new);
    }

    public List<Line> getLines() {
        return this.lines;
    }

    public int getResult(int position) {
        int currentPosition = position;

        for (int i = 0; i < lines.size(); i++) {
            currentPosition = lines.get(i).getPlusMinusPosition(currentPosition);
        }

        return currentPosition;
    }
}
